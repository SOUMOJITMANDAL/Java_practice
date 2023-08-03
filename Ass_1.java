package com.Mindtree;

import java.util.Scanner;

public class Ass_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int res=findnumberofsuperiorelements(arr,n);
        System.out.println(res);
    }

    public static   int findnumberofsuperiorelements(int[] arr,int n) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count/2;
    }
}
