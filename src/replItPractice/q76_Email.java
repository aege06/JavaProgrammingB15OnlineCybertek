package replItPractice;

import java.util.Scanner;

public class q76_Email {
    public static void main(String[] args) {
        //In this task, you need to swap first name with last name in the email.
        // If email doesn't contains underscore - do nothing.
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (email.contains("_")) {
           // int firstSpaceIndex = email.indexOf("_");
            //int lastSpaceIndex = email.lastIndexOf("@");
            //System.out.println(email.substring(firstSpaceIndex + 1, lastSpaceIndex) +"_" + email.substring(0, firstSpaceIndex) +"@gmail.com");
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring(0,email.indexOf("_"))+"@gmail.com");
        } else {
            System.out.println(email);
        }
    }
}

