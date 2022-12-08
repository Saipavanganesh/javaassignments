package com.assignments;

import java.util.Scanner;

public class Q1_4 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        int sum;
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("Sum is "+sum);
    }
}
