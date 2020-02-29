package replItPractice;

import java.util.Scanner;

public class q34_VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        int itemPrice;
        int quarters,dimes,nickles;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents:");

        itemPrice= scan.nextInt();
        System.out.println("Your change is ");

        if(itemPrice<25 || itemPrice>100 ){
            System.out.println("Invalid price!");
    }
        if(itemPrice%5!=0){
            System.out.println("Invalid price!");
        }
}
}
