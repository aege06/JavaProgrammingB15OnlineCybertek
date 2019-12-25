package day07;

import java.util.Scanner;

public class emailBuilder {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
   //     String firstName = "Aysegul";
  //      String lastName = "Ege";
  //      String company = "Apple";
  //      String emailAddress =  firstName+lastName+"@"+company+".com" ;

  //      System.out.println("My name is " +firstName+ " "
        //      +lastName+ " and I work for "
  //              +company+ ".  My email address is " + emailAddress+ ".");

        System.out.println("Enter your first name , last name , company separated by space : ");

        String firstName, lastName, company, email;
        firstName = scan.next();   //"Aysegul";
        lastName = scan.next();   //"Ege";
        company = scan.next();   //"Apple";
        // firstName_lastName@company.com    Aysegul_Ege@Apple.com
        email = firstName + "_" + lastName + "@" + company + ".com";
        System.out.println(" My name is " + firstName + " " + lastName
                + " and I work for " + company + " "
                + "and my email is " + email);
    }
}
