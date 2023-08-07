package com.Mindtree.functions;
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Oddeven();
        System.out.println(Oddeven());
    }
    static boolean Oddeven() {
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int num ;
        num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
            
        } else {
            System.out.println("odd");
        }
        return false;
    }
}
