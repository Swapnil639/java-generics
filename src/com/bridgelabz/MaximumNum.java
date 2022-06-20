package com.bridgelabz;

public class MaximumNum {
    public static <T extends Comparable> T testcase(T a,T b,T c) {
        T maximum=a;
        if (b.compareTo(maximum)>0) {
            maximum = b;
        } else if (c.compareTo(maximum)>0) {
            maximum = c;
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum problem using Generics");
        System.out.println("Maximum among three Integer is :"+testcase(30,60,20));
        System.out.println("Maximum among three Float is :"+testcase(10.0f,30.57f,70.56f));
        System.out.println("Maximum among three String is :"+testcase("Apple","Peach","Banana"));

    }
}
