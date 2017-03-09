package com.akhambir.mocked_package.with_void_type;

import com.akhambir.mocked_pakage.with_void_type.FirstVoid;
import com.akhambir.mocked_pakage.with_void_type.SecondVoid;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestRunnerWithVoidType {

    @Mock
    private SecondVoid secondVoid;

    @InjectMocks
    private FirstVoid firstVoid;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private static final String TEST_CASE = "someString";
    private static final String OTHER_CASE = "otherCase";

    @Test
    public void simpleVoidMocking() {
        doNothing().when(secondVoid).doSomethingAsSecondVoid(TEST_CASE);

        firstVoid.doSomethingAsFirstVoid(TEST_CASE);
        verify(secondVoid).doSomethingAsSecondVoid(TEST_CASE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionExample() {
        doThrow(new IllegalArgumentException()).when(secondVoid).doSomethingAsSecondVoid(anyString());
        doNothing().when(secondVoid).doSomethingAsSecondVoid(TEST_CASE);

        firstVoid.doSomethingAsFirstVoid(TEST_CASE);
        verify(secondVoid).doSomethingAsSecondVoid(TEST_CASE);

        firstVoid.doSomethingAsFirstVoid(OTHER_CASE);
    }
}
