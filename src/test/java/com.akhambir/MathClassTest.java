package com.akhambir;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathClassTest {

    private MathClass mathClass;

    @Before
    public void beforeTest() {
         mathClass = new MathClass();
    }

    @Test
    public void shouldReturnSqrt() {
        int expectedResult = 2;
        int actualValue = 4;

        Assert.assertEquals(expectedResult, mathClass.sqrt(actualValue));
    }

    @Test
    public void shouldReturnPow() {
        int expectedResult = 4;
        int actualValue1 = 2;
        int actualValue2 = 2;

        Assert.assertEquals(expectedResult,
                mathClass.pow(actualValue1, actualValue2));
    }
}
