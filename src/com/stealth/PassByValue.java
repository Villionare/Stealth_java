package com.stealth;

public class PassByValue {
    public static void main(String[] args) {
        int a = 7;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        b++;
        System.out.println(b);
        System.out.println(a);


    }
}
