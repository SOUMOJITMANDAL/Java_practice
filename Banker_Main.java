package com.Mindtree;
public class Banker_Main {
    public static void main(String[] args) {
        Banker cl1 = new Banker();
        Banker cl2 = new Banker();

        cl1.AccountName="SAROJ KUMAR MANDAL";
        cl1.AccountNo= 385296254;
        cl1.AccountBalance=2545786;
        cl1.rate=7.5f;
        cl1.timeinYrs=2.6f;
        cl1.Interest= (cl1.AccountBalance*cl1.rate*cl1.timeinYrs)/100;
        cl1.BranchName="NEW MARKET BRANCH";
        cl1.BranchCode= 4662;
        cl1.displayAccountDetails();
        cl1.Interest();

        System.out.print("\n");

        cl2.AccountName="KANCHAN MANDAL";
        cl2.AccountNo= 385296456;
        cl2.AccountBalance=254578;
        cl2.rate=7.5f;
        cl2.timeinYrs=3.1f;
        cl2.Interest= (cl2.AccountBalance*cl2.rate*cl2.timeinYrs)/100;
        cl2.BranchCode= 9470;
        cl2.BranchName="BARODA PARK BRANCH";
        cl2.displayAccountDetails();
        cl2.Interest();
    }
}
