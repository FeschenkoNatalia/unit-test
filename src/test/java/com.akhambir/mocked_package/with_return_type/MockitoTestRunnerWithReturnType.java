package com.akhambir.mocked_package.with_return_type;

import com.akhambir.mocked_pakage.with_return_type.First;
import com.akhambir.mocked_pakage.with_return_type.Second;
import com.akhambir.mocked_pakage.with_return_type.Third;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestRunnerWithReturnType {

    @Mock
    private Third third;

    @Mock
    private Second second;

    @InjectMocks
    private First first = new First(null, null);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private static final String TEST_CASE = "someString";
    private static final String RANDOM_CASE = "randomString";
    private static final String OTHER_CASE = "otherCase";

    @Test
    public void test() {
        first.doSomethingAsFirst(TEST_CASE);
        verify(second).doSomethingAsSecond(TEST_CASE);

        first.doSomethingAsFirstWithThird(TEST_CASE);
        verify(third).doSomethingAsThird(TEST_CASE);
    }

    @Test
    public void ignoreParameter() {
        first.doSomethingAsFirst(RANDOM_CASE);
        verify(second).doSomethingAsSecond(anyString());
    }

    @Test
    public void stubParameter() {

        when(second.doSomethingAsSecond(TEST_CASE)).thenReturn(OTHER_CASE);
        stub(second.doSomethingAsSecond(TEST_CASE)).toReturn(OTHER_CASE);
        doReturn(OTHER_CASE).when(second).doSomethingAsSecond(TEST_CASE);

        assertEquals(OTHER_CASE, first.doSomethingAsFirst(TEST_CASE));
    }

    @Test(expected = Exception.class)
    public void exceptionExample() {
        when(second.doSomethingAsSecond(anyString())).thenThrow(new Exception());

        first.doSomethingAsFirst(TEST_CASE);
    }
}
