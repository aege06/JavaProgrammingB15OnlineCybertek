package day05;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
       // System.out.println("What is the temperature in F ?");
       // double fahrenheit =  scan.nextDouble();
       // double celsius = (5.0/9)* (fahrenheit-32);
       // System.out.println(" fahrenheit" +fahrenheit+ "is" +celsius+ "in celsius");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many minutes are there in a day?");
        int day = scan.nextInt();
        int minute = (60*24);
        System.out.println("There are " + minute+ " minutes in a day.");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your hourly wage?");
        int wageInHour = scan.nextInt();
        int yearlySalary = ( wageInHour*8*365);
        System.out.println("Your yearly salary is" + yearlySalary);

        Scanner number = new Scanner(System.in);
        System.out.println("What is the price for potato?");
        float potatoPrice = scan.nextFloat();
        System.out.println("How many do you want to buy? ");
        int potatoCount = scan.nextInt();
        System.out.println("Your total for potato is " + potatoCount*2.99);


    }
}
