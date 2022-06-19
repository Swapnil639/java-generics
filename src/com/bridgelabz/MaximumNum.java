package com.bridgelabz;

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum problem using Generics");
        MaximumNum obj = new MaximumNum();
        System.out.println("Maximum among three Integer number is :"+obj.compareTo());

    }
    public Integer compareTo(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter three Integer Number :");
        Integer a=scanner.nextInt();
        Integer b=scanner.nextInt();
        Integer c=scanner.nextInt();
        Integer maximum;

        if(a>b && a>c){
            maximum=a;
        }else if(b>a && b>c){
            maximum=b;
        }else {
            maximum = c;
        }
        return maximum;
    }
}
