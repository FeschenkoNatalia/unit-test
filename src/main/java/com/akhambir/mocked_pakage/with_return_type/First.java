package com.akhambir.mocked_pakage.with_return_type;

public class First {
    private Second second;
    private Third third;

    public First(Second second, Third third) {
        this.second = second;
        this.third = third;
    }

    public String doSomethingAsFirst(String string) {
        return second.doSomethingAsSecond(string);
    }

    public String doSomethingAsFirstWithThird(String string) {
        return third.doSomethingAsThird(string);
    }
}
