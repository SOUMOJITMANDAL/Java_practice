package com.Mindtree.MindTree;

public class Road_Toll {
    String Vehicle_Type;
    int No_of_Tyres;
    public void display_Toll_Tax(){
        if (No_of_Tyres==2){
            System.out.println(Vehicle_Type);
            System.out.println("Toll Amount = 5$");
        } else if (No_of_Tyres==4) {
            System.out.println(Vehicle_Type);
            System.out.println("Toll Amount = 10$");
        } else if(No_of_Tyres>4) {
            System.out.println(Vehicle_Type);
            System.out.println("Toll Amount = 20$");
        } else{
            System.out.println(Vehicle_Type);
            System.out.println("Toll Free.");
        }
    }
    public Road_Toll(){
        //Default constructor
    }
    public Road_Toll(String Vehicle_Type,int No_of_Tyres){//specified constructor
       this.Vehicle_Type=Vehicle_Type;
       this.No_of_Tyres=No_of_Tyres;
    }
}
