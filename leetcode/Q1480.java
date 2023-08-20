package com.Mindtree.leetcode;
//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;
import java.util.Scanner;
public class Q1480 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = in .nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n ; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans[i]= sum;
        }
        return ans;
    }
}
