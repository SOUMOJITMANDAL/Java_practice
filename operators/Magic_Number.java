package com.Mindtree.operators;
import java.util.Scanner;
// magic number is a number where it is first converted into its binary form then the last digit obtained is multiplied with the exponent of 5 at each of its position taken as 1, 2, 3 ...n from the right
public class Magic_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to determine its magic number: ");
        int n = in.nextInt();
        int ans = 0;
        int base = 5;
        while (n>0){
            int last = n&1;
            n = n>>1;
            ans = ans + last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
