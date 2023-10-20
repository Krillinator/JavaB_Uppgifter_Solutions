package com.kristoffer.demo.lektion_1.uppgift_2;

public class MyCounter {

    static int countValue;

    public void counter() {
        System.out.println(countValue);
        countValue++;
        System.out.println(countValue);
    }
    static public void counterStatic() {
        System.out.println(countValue);
        countValue++;
        System.out.println(countValue);
    }

}
