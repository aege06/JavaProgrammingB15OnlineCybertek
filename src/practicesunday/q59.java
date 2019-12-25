package practicesunday;

import java.util.Scanner;

public class q59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        if (fullName.equalsIgnoreCase("Max Payne")) {
            System.out.println("User found!");
        } else if (fullName.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }
    }
}
