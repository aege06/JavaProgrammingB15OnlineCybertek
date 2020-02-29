package replItPractice;

import java.util.Scanner;

public class q74_75_EmailAlejandro {
    public static void main(String[] args) {
//        alejandro have started learning java, he knows what you know about ifs and strings.
//        he has a large number of text emails, going trough all of them will take a lot of time.
//        to save time he will only read the emails that refer to him by name.
//                he wants to write a program that gets a string (the email) and determines if his name "alejandro"
//        appears in that string. if so it will output "read this mail" else it will output "dont read".

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.contains("alejandro") && a.contains("project")) {
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }

    }
}