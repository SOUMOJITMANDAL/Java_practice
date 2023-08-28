package com.Mindtree.binarysearchinterveiw;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLastPosTarget{
    public static void main(String[] args) {
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]= search(nums,target,true);
        ans[1]= search(nums,target,false);
        return ans;
    }
    // this function returns value of target
    int search(int[] nums, int target,boolean StartIndexValue){
        int ans = -1;
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start= mid+1;
            }
            else {
                //potential answer is found
                ans = mid;
                // checking for the first index value
                if (StartIndexValue==true) {
                    end=mid-1;
                }else{
                    start= mid+1;
                }
            }
        }
        // if no ans is found
        return ans;
    }
}


