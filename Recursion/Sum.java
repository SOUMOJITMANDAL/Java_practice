package com.Mindtree.Recursion;
import java.util.Scanner;

public class Sum {
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            System.out.println("Enter number :");
            int num = in.nextInt();
            int res =print(num);
            System.out.println(res);
        }
        static int print(int num){
            int res = print(num+num);
            System.out.println(res);
            return num==20? num: -1;
        }
}