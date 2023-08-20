package com.Mindtree.leetcode;
import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/build-array-from-permutation/
public class Q1920 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = in .nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n ; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(nums)));

    }
    public static  int[] buildArray (int[] nums){
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
