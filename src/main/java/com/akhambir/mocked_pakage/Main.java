package com.akhambir.mocked_pakage;

import com.akhambir.mocked_pakage.with_return_type.*;

public class Main {
    public static void main(String[] args) {
        Third third = new ThirdImpl();
        Second second = new SecondImpl();
        First first = new First(second, third);

        System.out.println(first.doSomethingAsFirst("A"));
        System.out.println(first.doSomethingAsFirstWithThird("A"));
    }
}
