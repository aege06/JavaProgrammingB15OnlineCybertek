package day11;

import java.util.Scanner;

public class LightOnOff_WithScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What room are you going to?");
        String targetOption = scan.nextLine();
        switch (targetOption) {
            case "Bd":
                System.out.println("You have turned on the bedroom light");
                targetOption = "bedroom";
                break;
            case "Lr":
                System.out.println("You have turned on the living room light");
                targetOption = "living room";
                break;
            case "Ki":
                System.out.println("You have turned on the kitchen light");
                targetOption = "kitchen";
                break;
            case "Ha":
                System.out.println("You have turned on the hallway light");
                targetOption = ("hallway");
                break;
            default:
                System.out.println("Something is wrong with the lights!!!");
        }
    }
}
