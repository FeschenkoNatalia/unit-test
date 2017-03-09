package com.akhambir.mocked_pakage.with_void_type;

public class FirstWithTwoDependencies {
    private SecondVoid second1;
    private SecondVoid second2;

    public FirstWithTwoDependencies(SecondVoid second1, SecondVoid second2) {
        this.second1 = second1;
        this.second2 = second2;
    }

    public void doSomethingAsFirstWith2DI(String string) {
        second1.doSomethingAsSecondVoid(string);
        second2.doSomethingAsSecondVoid(string);
    }
}
