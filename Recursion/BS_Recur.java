package com.Mindtree.Recursion;
import java.util.Scanner;
public class BS_Recur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element to be searched :");
        int target = in.nextInt();
        int result = search(arr,target,0,arr.length-1);
        System.out.println("The target element is at index : "+result);
    }
    public static int search(int[] arr, int target, int start, int end ){
        if (start > end){
            return -1;
        }
        int mid = start + ((end-start)/2);
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target, mid+1, end);
    }
}
