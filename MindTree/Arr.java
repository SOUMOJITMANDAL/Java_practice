package com.Mindtree.MindTree;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i]=in.nextInt();
        }
        int pos= in.nextInt();
        int element =  in.nextInt();

        arr[pos]= element;

        for ( int x: arr){
            System.out.print( (float) x + " ");
        }
        for(int k = 0; k < arr.length; k++) {
            for(int j = k + 1; j < arr.length; j++) {
                if(arr[k] == arr[j])
                    System.out.print("\n"+(float) arr[j]);
            }
        }
    }
}
