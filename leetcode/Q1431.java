package com.Mindtree.leetcode;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q1431 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = in .nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n ; i++) {
            candies[i] = in.nextInt();
        }
        System.out.println("Enter the extra candies :");
        int extra = in.nextInt();
        System.out.println(kidsWithCandies(candies,extra));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int kid:candies) {
           max=  Math.max(max,kid);
        }
        ArrayList<Boolean> list = new ArrayList<>(){};
        for (int i = 0; i < candies.length; i++) {  //Remember, when working with booleans, we don't need an if statement:
            candies[i]= candies[i]+ extraCandies;
            list.add(candies[i]>=max);
        }
        return list ;
    }
}
