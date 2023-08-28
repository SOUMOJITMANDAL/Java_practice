package com.Mindtree.MindTree;

public class Banker {

    String AccountName=" ";
    long AccountNo=100;
    float AccountBalance=1.0f;
    String BranchName=" ";
    long BranchCode=100;
    float rate = 1.0f;
    float timeinYrs = 2.0f;
    double Interest= ((AccountBalance*rate*timeinYrs)/100);
    public void displayAccountDetails(){
        System.out.println("Dear customer, "+AccountName+" with Account No- "+AccountNo+" your Account balance is- "+AccountBalance);
        System.out.println("Branch-"+BranchName+" IFSC CODE-SBIN000"+BranchCode);
    }
    public void Interest(){
        System.out.println("Dear customer, "+AccountName+" with Account No- "+AccountNo+" your Account balance is- "+AccountBalance+" and as per the ongoing rate of:"+rate+"% pa. You will get a interest of: Rs"+Interest+" in "+timeinYrs+"years.");
    }
}
