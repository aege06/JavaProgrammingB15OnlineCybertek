package day17;

import java.util.Scanner;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        //   String name="Aysegul";
        //   int x=0;
        //   while(x<name.length()){
        //       System.out.print("index " +x+ " : ");
        //      System.out.println(name.charAt(x));
        //      ++x;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String name = scan.nextLine();
        int x = 0;

        while (x < name.length()) {  //     (  x <= name.length()-1  )
            System.out.print("index " + x + " : ");
            System.out.println(name.charAt(x));
            ++x;


        }
    }
}

