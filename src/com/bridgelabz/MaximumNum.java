package com.bridgelabz;

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum problem using Generics");
        MaximumNum obj = new MaximumNum();
        System.out.println("Maximum among three String is :" + obj.compareTo());

    }

    public String compareTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three String :");

        String a = scanner.nextLine();
        System.out.println(a);

        String b = scanner.nextLine();
        System.out.println(b);

        String c = scanner.nextLine();
        System.out.println(c);

        String maximum=a;
        if (b.compareTo(maximum)>0) {
            maximum = b;
        } else if (c.compareTo(maximum)>0) {
            maximum = c;
        }
        return maximum;
    }
}
