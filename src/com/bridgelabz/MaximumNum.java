package com.bridgelabz;

import java.util.Arrays;

public class MaximumNum {
    public static <T> T testcase(T...a){
        Arrays.sort(a);
        return a[a.length-1];
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum problem using Generics");

        System.out.println("Maximum of Integer number is :"+testcase(10,49,78,45,89,40));
        System.out.println("Maximum of Float number is :"+testcase(10.2,49.6,78.8,45.0,89.9,40.8));
        System.out.println("Maximum of String value is :"+testcase("Apple","Banana","Orange","Grapes","Cherry"));


    }
}

