package replItPractice;

import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        int totalBalance = 100;
        int currentBalance;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose item:");
        String item = scan.nextLine();
        if (item.equals("Smartphone")) {
            currentBalance = totalBalance - 300;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Laptop")) {
            currentBalance = totalBalance - 400;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            currentBalance = totalBalance - 15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 10;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 30;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 50;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 25;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 5;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 60;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            currentBalance = totalBalance - 40;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
