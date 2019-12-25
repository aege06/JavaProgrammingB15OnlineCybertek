package day22;

import java.util.function.DoubleToIntFunction;

public class MultiplicationTable {
    public static void main(String[] args) {
     /*   System.out.println("Multiplication table of 1 ");
        for (int base =1; base <=12 ; base++) {
            System.out.println("1x"+base+" = "+1*base);
        }
        System.out.println("Multiplication table of 2 ");
        for (int base =1; base <=12 ; base++) {
            System.out.println("2x"+base+" = "+2*base);

        }
        System.out.println("Multiplication table of 3 ");
        for (int base =1; base <=12 ; base++) {
            System.out.println("3x"+base+" = "+3*base);
        }*/
//this loop is for iterating number from 1 to 10 to get multiplication table
        for (int timesTable = 1; timesTable <= 10; timesTable++) {
            //I want to know which number i want to get multiplication table
            System.out.println("Mutiplication table of " + timesTable);
            //this loop will generate multiplication table for one number
            for (int base = 1; base <= 12; base++) {
                System.out.println(+timesTable + " x " + base + " = " + timesTable * base);
            }

        }
    }
}

