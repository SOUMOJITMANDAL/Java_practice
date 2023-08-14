package com.Mindtree.leetcode;
//https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Scanner;
public class findDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of elements in the array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        int res = duplicateNumber(arr);
        System.out.println("The duplicate number is: "+res);
    }
    public static int duplicateNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
        if (nums[i] != i + 1) {
                int correct = nums[i];
                if (nums[i] < nums.length && nums[i] != nums[correct]) { // check if the element of nums at the index is not equal to n,ie, the size of the array and if the value of the element is same as that of the index
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }else{
            i++;
        }
        }
        return -1;
    }
        private static void swap ( int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
}
