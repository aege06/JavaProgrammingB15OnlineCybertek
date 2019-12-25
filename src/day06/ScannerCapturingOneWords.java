package day06;

import java.util.Scanner;

public class ScannerCapturingOneWords {
    public static void main(String[] args) {
        Scanner blable = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = blable.next();// it will only capture

       // String anotherWord = blable.next();
        System.out.println("My name is " +name);
       // System.out.println(" Another word is " + anotherWord);

        int age = blable.nextInt();
        System.out.println("I am " +age+ " years old");





    }
}
