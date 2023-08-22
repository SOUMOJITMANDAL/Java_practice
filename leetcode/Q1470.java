package com.Mindtree.leetcode;
import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/shuffle-the-array/
public class Q1470 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = in .nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the value of n/2 ie, half the size of the array :");
        int m = in.nextInt();
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n ; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums,m)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int size = 2*n;
        int[] result = new int [size];
        int j=0;
        for (int i = 0; i < n; i++) {
            result[j]= nums[i];
            j +=2;
        }
        int k=1;
        for (int s=n; s<size ; s++){
            result[k]= nums[s];
            k +=2;
        }
        return result;
    }
}
