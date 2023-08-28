package com.Mindtree.MindTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestOf3no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number:");
        a= in.nextInt();
        System.out.println("Enter the second number:");
        b= in.nextInt();
        System.out.println("Enter the third number:");
        c= in.nextInt();

        System.out.println("the largest number is " +check(a,b,c));

    }

     static int check(int a, int b, int c) {
        int largest = 0;
        if(a>=b){
            if (b>=c){
                largest = a;
                System.out.println("A is the largest number");
            } else if (b>=a && b>=c) {
                largest =b;
                System.out.println(("B is the greatest number"));
            } else  {
                largest = c;
                System.out.println(" C is the largest number ");
            }
        }

         return largest;
     }
}
