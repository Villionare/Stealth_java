package com.stealth.one_arrays;

import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        //basic ways to create arrays:
        int[] roll = new int[7];
        //creation of reference variable happens at compile time in stack memory (int[] roll = )
        //creation of object happens at runtime in heap memory ( = new int[7]), this is called
        //dynamic memory allocation - memory is allocated in the runtime

        int[] second;
        second = new int[10];
        System.out.println(second[2]);
        int[] third = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(third));

    }
}
