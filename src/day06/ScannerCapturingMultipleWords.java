package day06;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class ScannerCapturingMultipleWords {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name =blabla.nextLine();
        System.out.println( "You have entered " + name);
        System.out.println("Where do you live?");
        String cityAndState = blabla.nextLine();
        System.out.println( "You have entered" + cityAndState);
        System.out.println("What is your street address ? ");
        String streetAddress = blabla.nextLine();
        System.out.println("Your street address is " + streetAddress);

    }
}
