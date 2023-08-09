//https://leetcode.com/problems/missing-number/
/* since the elements in the array includes 0 , when sorted the elements value will be same as that of the index
therefore if the size of the array is n (4), then we have to ignore the value 4 since it will result to ArrayIndexOutOfBoundException*/
package com.Mindtree.leetcode;
import java.util.Scanner;
public class missing_268 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of elements in the array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        int res = missingNumber(arr);
        System.out.println("The missing number is: "+res);

    }
    public static int missingNumber(int[] nums){
        int i=0;
        while(i< nums.length){
            int correct = nums[i];
            if (nums[i]<nums.length && nums[i]!= nums[correct]){ // check if the element of nums at the index is not equal to n,ie, the size of the array and if the value of the element is same as that of the index
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for the missing number in nums[]
        for (int index = 0; index < nums.length; index++) { //case:1
            if (nums[index]!=index){
                return index;
            }
        }
        return nums.length; //case:2
    }
    private static void swap(int[] arr, int i, int correct) {
        int temp= arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}

