package com.bridgelabz;


class GenericsClass<T extends Comparable>{
    T a;
    T b;
    T c;
    public GenericsClass(T a,T b,T c){
       this.a=a;
       this.b=b;
       this.c=c;
    }
    public T testcase() {
        T maximum=a;
        if (b.compareTo(maximum)>0) {
            maximum = b;
        } else if (c.compareTo(maximum)>0) {
            maximum = c;
        }
        return maximum;
    }
}



public class MaximumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum problem using Generics");

        GenericsClass<Integer> genericsClass = new GenericsClass<>(30,60,20);
        GenericsClass<Float> genericsClass1 = new GenericsClass<>(1.0f,3.7f,7.6f);
        GenericsClass<String> genericsClass2 = new GenericsClass<>("Apple","Peach","Banana");

        System.out.println(genericsClass.testcase());
        System.out.println(genericsClass1.testcase());
        System.out.println(genericsClass2.testcase());


    }
}

