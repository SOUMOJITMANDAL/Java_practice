package com.Mindtree.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_Example{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); //initialize an ArrayList
//Syntax ArrayList <Datatype> name = new Arraylist<Datatype optional>(Initial Capacity;10);
        list.add(69);
        System.out.println("Size: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list.contains(69)); // returns boolean value; check whether the element is present in the list or not
        System.out.println(list.set(0,96));// list.set(index, element) to update an element at a specific index
        System.out.println(list);

        list.remove(0); // element at specified index will be deleted
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));// to get an element at index i

        }

    }
}
