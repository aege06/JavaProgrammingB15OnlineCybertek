package day11;

import jdk.swing.interop.SwingInterOpUtils;

public class StringEquality {
    public static void main(String[] args) {

        String name = "Aysegul"; //String literal
        String name2 = new String ("Aysegul");
        String name3 = "Aysegul";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("USING == METHODS");
        System.out.println(name == name2);
        System.out.println(name == name3);


        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));


    }

    }

