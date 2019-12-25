package day06;

import java.util.Scanner;

public class ShoppingPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        double regularPrice;
//        double salePrice;
//        double discount;
        // if you have variables with same data type , you can declare them in one line like this :
        double regularPrice,  salePrice , discount ;
        System.out.println("What is the regular price ? ");
        regularPrice = scan.nextDouble();
        System.out.println("What is discount rate ?");
        discount = scan.nextDouble();
        salePrice = regularPrice - regularPrice * discount;
        System.out.println("regular price is " + regularPrice
                + "$ , discount is " + discount + "  and your got deal for " + salePrice + "    $");

    }
}
