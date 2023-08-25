package com.Mindtree.Recursion;
import java.util.Scanner;
public class fibonacci_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of location for finding its fibonacci number :");
        int n = in.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }
    public static int fibo(int n ) {
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
// note - first main() will go into the stack then Fibo(n) will sit on top of it, suppose for n =4 , first fibo(4) will be called which will call fibo(n-1) ie, fibo(3)
// then fibo(3) will call fibo(2) and fibo(2 will call fibo(1), but when the value of argument is 1, the base condition will be true hence 1 will be returned and
// it will come out of the first function ie,fibo(n-1) and will return its value back to fibo(2) and go to the second function on the right side of the (+) ie, fibo(n-2)
// hence fibo(0) will be called that will return 0 , therefore fibo(2) = 1+0 =1.
// when fibo(1) will be finished executing it will we removed from the stack , fibo(0) will sit into its place and after returning 0 , fibo(0) will also be removed
// fibo(2) will have a value of 1 which is to be returned to fibo(3) , fibo(3) will call fibo(n-2) ie, fibo(1) which will return 1 , hence
// vale of fibo(2) {1} will be added to value of fibo(1) {1} ; fibo(3) = 1+1 = 2 which will be returned to fibo (4)
// fibo(4) will call fibo(2) which will fibo(1) , value 1 returned , then fibo(0) will be called and 0 will be retuned , therefore 0+1 = 1 , fibo(2) =1
// fibo(3) = 2, fibo(2) = 1, therefore fibo(4) = 2+1 = 3 which will be retuned to the main function and stored in the variable ans and printed.

