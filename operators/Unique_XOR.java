package com.Mindtree.operators;
import java.util.Scanner;
public class Unique_XOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  =in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int res = ans(arr);
        System.out.println("The unique element is "+res);
    }
    public  static int ans (int[] arr){
        int unique = 0; // any number XOR'ed with 0 gives the number itself (identity of zero)
        for( int n : arr){
            unique = unique ^ n;
        }
        return unique; // any number XOR'ed wit itself gives the number itself. 0^a  = a; a^a = 0 ; a^1 = 1 and vice versa
    }
    // here the order dose not matter  at the end the duplicates XOR'ed with themselves will give 0 eventually the unique element will be the remaining one
    // and the order dosenot matter because Xor'ed sem will eventually cancel out the duplicates
}
