package com.Mindtree;

import java.util.Scanner;

public class Ass {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String string = s.nextLine();
            int index = -1;
            char fnc =' ';
            for (char i : string.toCharArray()) {
                if (string.indexOf(i) == string.lastIndexOf(i)) {
                    fnc = i;
                    break;
                }
                else {
                    index += 1;
                }
            }
            if (index == 1) {
                System.out.println(-1);
            }
            else {
                System.out.println(string.indexOf(fnc));
            }
        }
    }
