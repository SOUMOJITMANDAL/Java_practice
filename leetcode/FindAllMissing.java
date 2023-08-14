package com.Mindtree.leetcode;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindAllMissing {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.println("Enter size of the array: ");
        n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        // find missing digits and return an ArrayList
        ArrayList<Integer> li = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index]!= index+1){
                li.add(index+1);
            }
        }
        return li;
    }
    private static void swap(int[] nums, int i, int correct) {
        int temp = 0;
        temp= nums[i];
        nums[i]=nums[correct];
        nums[correct]= temp;
    }
}
