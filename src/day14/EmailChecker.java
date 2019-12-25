package day14;

public class EmailChecker {
    public static void main(String[] args) {

        /*Create a class called EmailChecker with main method:
        create a variable called email
        check for below conditions
        if it does not contain character @  say invalid email
        if it contain space say invalid email
        if it endsWith @gmail.com  -->> gmail
        if it endsWith @yahoo.com  -->> yahoo email
        if it endsWith @mail.ru  -->> russian email*/

        String email = "aege@gmail.com";
        boolean character = email.contains("@");
        boolean space = !email.contains(" ");
        boolean ends1 = email.endsWith("@yahoo.com");
        boolean ends2 = email.endsWith("@gmail.com");
        boolean ends3 = email.endsWith("@mail.ru");
        if (character && space && ends2) {
            System.out.println("gmail");
        } else if (character && space && ends1) {
            System.out.println("yahoo");
        } else if (character && space && ends3) {
            System.out.println("Russian");
        } else {
            System.out.println("Invalid");

        }


    }
}

