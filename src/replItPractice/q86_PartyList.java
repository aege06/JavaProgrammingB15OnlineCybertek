package replItPractice;

import java.util.Scanner;

public class q86_PartyList {
    public static void main(String[] args) {
        //Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //Ask for the first guest name.
        //Then ask does user want to enter one more guest.
        // If yes - take input from.
        //If not - finish the program and print list of the guests.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name: ");
        String guestName=input.nextLine();
        System.out.println("Do you want to enter new guest name: ");
        String newGuest=input.nextLine();
        while(newGuest.equals("yes")){
            System.out.println("Please enter guest name: ");
            String name=input.next();
            guestName = guestName+ ", "+name;

            System.out.println("Do you want to enter new guest name:");
            newGuest=input.next();
        }


        System.out.println("Guest's list: "+guestName);



    }
}


