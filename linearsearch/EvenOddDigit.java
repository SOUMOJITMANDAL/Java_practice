package com.linearsearch;
public class EvenOddDigit {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        int ans=findnumbers(nums);
        System.out.println(ans);
    }
     static int findnumbers(int[] nums) {
        int count = 0;
         for (int num:nums) {
             if(even(num)){
                 count++;
             }
         }
     return count;
    }
//function to check whether a number contains even number of digits or not
     static boolean even(int num) {
        int NumOfDigits= digits(num);
        return NumOfDigits%2==0;
    }

    static int digits(int num) {
        if (num<0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }
        int count =0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
