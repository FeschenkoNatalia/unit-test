package com.akhambir.mocked_package.with_return_type;

import com.akhambir.mocked_pakage.with_return_type.First;
import com.akhambir.mocked_pakage.with_return_type.Second;
import com.akhambir.mocked_pakage.with_return_type.Third;
import com.akhambir.mocked_pakage.with_return_type.ThirdImpl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


public class MockitoTestSetupOldStyle {
    private First first;
    private Second second;
    private Third third;


    @Before
    public void init() {
        second = mock(Second.class);
        third = spy(new ThirdImpl());
        first = new First(second, third);
    }

    @Test
    public void test() {
        String testCase = "someString";
        first.doSomethingAsFirst(testCase);
        verify(second).doSomethingAsSecond(testCase);
    }
}
