package day07;

import java.util.Scanner;

public class replit20 {

    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        String amOrPm;

        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();


       System.out.println(hour +":" + minute +":"+ second+ " " +amOrPm);
    }
}
