package day18;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Knock Knock!!");
        System.out.println("What is the password? ");

        String password=scan.next();
        while(!password.equals("B15")){
            System.out.println("Wrong Password!! Try again!! ");
            password =scan.next();
        }
        System.out.println("Open Sesame !!!");
    }
}
