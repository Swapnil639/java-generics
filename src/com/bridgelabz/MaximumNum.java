package com.bridgelabz;

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum problem using Generics");
        MaximumNum obj = new MaximumNum();
        System.out.println("Maximum among three Float number is :" + obj.compareTo());

    }

    public Float compareTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three Float Number :");
        Float a = scanner.nextFloat();
        Float b = scanner.nextFloat();
        Float c = scanner.nextFloat();
        Float maximum;

        if (a > b && a > c) {
            maximum = a;
        } else if (b > a && b > c) {
            maximum = b;
        } else {
            maximum = c;
        }
        return maximum;
    }
}
