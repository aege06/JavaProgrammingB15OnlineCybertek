package day09;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int myNumber = scan.nextInt();

        if(myNumber % 2 == 0){
            System.out.println("This number is even!!");

        }else {
            System.out.println("This number is odd!!");

        }
        }
}
