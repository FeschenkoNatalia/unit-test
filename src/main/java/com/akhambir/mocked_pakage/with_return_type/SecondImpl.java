package com.akhambir.mocked_pakage.with_return_type;

public class SecondImpl implements Second {
    public String doSomethingAsSecond(String string) {
        return string + " " + string;
    }
}
