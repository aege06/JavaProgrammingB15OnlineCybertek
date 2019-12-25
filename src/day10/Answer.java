package day10;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String myAnswer = "";
                int myNumber = scan.nextInt();
                if (myNumber % 5 == 0) {
                    myAnswer = "a Fizz number";
                } else {
                    myAnswer = "not a Fizz number";
                }
                System.out.println("My number is " + myNumber
                        + " , It is " + myAnswer + "");
            }

        }



