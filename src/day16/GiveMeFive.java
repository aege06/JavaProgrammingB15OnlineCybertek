package day16;

import java.util.Scanner;

public class GiveMeFive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int userNumber=0;
        while(userNumber!=5){
            System.out.println("GIVE ME 5!!");
            userNumber=scan.nextInt();
        }
        System.out.println("END OF THE PROGRAM!!!");
    }
}
