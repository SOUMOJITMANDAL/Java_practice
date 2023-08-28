package com.Mindtree.MindTree;

public class RoadToll_Main {
    public static void main(String[] args) {
        Road_Toll rt1 = new Road_Toll();
        Road_Toll rt2 = new Road_Toll();
        Road_Toll rt3 = new Road_Toll();
        Road_Toll rt4 = new Road_Toll("Human",0);
        rt1.Vehicle_Type="Hatchback";
        rt1.No_of_Tyres=4;
        rt1.display_Toll_Tax();
        System.out.print("\n");
        rt2.Vehicle_Type="Truck";
        rt2.No_of_Tyres=20;
        rt2.display_Toll_Tax();
        System.out.print("\n");
        rt3.Vehicle_Type="Bike";
        rt3.No_of_Tyres=2;
        rt3.display_Toll_Tax();
        System.out.print("\n");
        rt4.display_Toll_Tax();
    }
}
