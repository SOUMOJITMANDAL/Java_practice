package com.Mindtree.cyclicsort;
import java.util.Arrays;
import java.util.Scanner;
public class CycleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //int[] arr= {3, 4, 1, 2, 5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void cyclic(int[] arr) {
        int i=0;
        //int correct = arr[i]-1;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct) {
        int temp= arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
