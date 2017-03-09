package com.akhambir.mocked_pakage.with_void_type;

public class FirstVoid {
    private SecondVoid secondVoid;

    public FirstVoid(SecondVoid secondVoid) {
        this.secondVoid = secondVoid;
    }

    public void doSomethingAsFirstVoid(String string) {
        secondVoid.doSomethingAsSecondVoid(string);
    }
}
