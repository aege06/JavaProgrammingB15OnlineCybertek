package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        Scanner blable = new Scanner(System.in);

String citizenType ;
        System.out.println("Please enter your age : ");
int age = blable.nextInt();

        if (age>65) {
            citizenType = "Senior!";
        }else{
            citizenType = "Not Senior!";

        }
        System.out.println(citizenType);




    }
}

   // String citizenType;

   // int age = 40;
//
     //   if (age > 65) {
     //           citizenType = "Senior";
      //          } else {
      //          citizenType = "Not Senior";
     //          }

         //       System.out.println("The citizen age is " + age + " ,and he is a " + citizenType);
