package com.Mindtree.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://leetcode.com/problems/number-of-good-pairs/
public class Q1512 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = in .nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n ; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));

    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1 ; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static  int numIdenticalPairs_or(int[] arr) { // using Hashmap
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> m: hm.entrySet()){
            int i = m.getValue();
            int res = (i*(i-1))/2;
            ans += res;
        }
        return ans;
    }

}
