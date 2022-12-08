package com.assignments;

import java.util.Scanner;

public class Q1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year");
        int year = sc.nextInt();
        if (year>=1582) {
            if (year%4==0) {
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("Entered year is a leap year");
                    }
                    else{
                        System.out.println("Entered year is not a leap year");
                    }
                }
                else{
                    System.out.println("Entered year is leap year");
                }
            } else {
                System.out.println("Entered year is not leap year");
            }
        }
    }
}