package com.Mindtree.MindTree;

import java.util.Scanner;

public class Str_Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        for (int i = s.length()-1;i>=0;i--){
            temp= temp + s.charAt(i);
        }
        System.out.println(temp);
    }
}
