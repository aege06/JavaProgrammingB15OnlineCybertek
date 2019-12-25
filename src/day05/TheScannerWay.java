package day05;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = scan.next();
        System.out.println("Your name is : " + name);

       System.out.println("What is your height : ");
       double height = scan.nextDouble();
        System.out.println("Your height is :" +height);

        System.out.println("What is your age : ");
        int age = scan.nextInt();
        System.out.println("You are " + age + " years old.");

    }
}
