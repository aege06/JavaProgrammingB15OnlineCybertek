package replItPractice;

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localCode=scan.nextInt();
        String phoneNumber= "("+areaCode+")-"+localCode;

        System.out.println("Calling number ("+areaCode+")-"+localCode);




       /* Instructions from your teacher:
        Write a program that asks user to input int values: areaCode and localNumber.

                -Using concatenation put together in this format and assign to String phoneNumber  variable:

        -(222)-3334444

                -Write a print statement that displays (use phoneNumber variable ):
        Calling number (222)-3334444*/
    }
}
