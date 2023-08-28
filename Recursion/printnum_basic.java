package com.Mindtree.Recursion;
// recursion is when the function calls itself multiple times until an exception is provided for eg, a return statement
// as many times we call the same function it will consume the memory each time we call
// recursion helps us in solving bigger and complex problems easily (Dynamic programming )
// convert recursion solution into iteration and vice versa
// Space complexity is not constant because of recursive calls
// break down bigger problems into smaller ones
// base condition is decided on the basis of known variable values
// recurrence relation is obtained and recursion tree is drawn
public class printnum_basic {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==20){
            //base condition in recursion after which the recursion will stop making further calls
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
