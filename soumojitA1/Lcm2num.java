package com.soumojitA1;

import java.util.Scanner;

public class Lcm2num {
    public static void main(String[] args) {
        int i,hcf=0,lcm=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();

        for (i=1 ; i<=num1 && i<=num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                hcf = i;
            }
        }
        System.out.println("HCF = " +hcf);

        lcm= (num1*num2)/hcf;
        System.out.println("LCM = "+lcm);
    }
}
