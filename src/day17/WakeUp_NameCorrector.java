package day17;

import java.util.Scanner;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter your first name: ");
        String name=scan.nextLine();
        System.out.println("Enter your last name");
        String name2=scan.next();
        System.out.print("My name is " + name.replace('a','A' ));
        System.out.print(" " +name2.replace('e','E'));


    }
}
