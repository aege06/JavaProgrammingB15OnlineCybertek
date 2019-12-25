package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please!!");
        String season= scan.next();

        if(season.equalsIgnoreCase(" spring")) {
            System.out.println("Hiking, Navruz, Alergy Season, Cool Weather");
        }else if( season.equalsIgnoreCase("summer")) {
            System.out.println("Pool, Swimming");
        }else if(season.equalsIgnoreCase("fall")) {
            System.out.println("barbecue");
        }else if(season.equalsIgnoreCase("winter")) {
            System.out.println("Code!!!");
        }else{
            System.out.println("NOT VALID!!!!");
        }
    }
}
