package com.Mindtree.leetcode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class DuplicateList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = in.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            nums[i]= in.nextInt();
        }
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i= 0;
        while (i < nums.length) {
            int correct =  nums[i]-1;
            if (nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!= j+1){
                list.add(nums[j]);
            }
        }
        return list ;
    }
    public static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i]=nums[correct];
        nums[correct]= temp;
    }
}
