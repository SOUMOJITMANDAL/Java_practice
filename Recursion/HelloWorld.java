package com.Mindtree.Recursion;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = in.next();
        message(name);
    }

    private static void message(String name) {

        System.out.println("Hello " + name);
        message(name);
    }
}
