package com.Mindtree.leetcode;
import java.util.Arrays;
import java.util.Scanner;
// https://leetcode.com/problems/concatenation-of-array/
public class Q1929 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = in .nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n ; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenation_or(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int size= 2*n;
        int[] ans = new int[size];
        for (int i = 0; i <n; i++) {
            ans[i] = nums[i];
        }
        for (int j =n ; j<size; j++) {
                ans[j]= nums[j-n];
            }
        return  ans;
    }
    public static int[] getConcatenation_or(int[] nums){ // in a single loop
        int [] ans = new int[nums.length *2];
        for (int i = 0; i < nums.length*2 ; i++) {
            ans[i]= nums[i% nums.length];
        }
        return ans;
    }
}
