package replItPractice;

import java.util.Scanner;

public class q77_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
//        Write a program that will print out information about user based on email. Print first and last name from the upper case.
//
//        Example:
//        Input: craig_federighi@apple.com
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//        Top-Level Domain: com
        String firstName=email.charAt(0)+"";
        String lastName=""+email.charAt(email.indexOf("_")+1);
        System.out.println("First name: "+firstName.toUpperCase()+email.substring(1,email.indexOf("_")));
        System.out.println("Last name: "+lastName.toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
        System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
        System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1,email.length()));



    }
}
