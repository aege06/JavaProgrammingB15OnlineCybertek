package day09;

public class LanguagePicker_With_Switch_Statement {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Call Center!");
        System.out.println("Please select your language option from 1-7");
        int languageOption = 5;
        switch (languageOption) {
            case 1:
                System.out.println("Hello");
                break;//used to get out of this branch
            case 2:
                System.out.println("Salam");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Privet");
                break;
            case 5:
                System.out.println("Merhaba");
                break;
            case 6:
                System.out.println("Szia");
                break;
            case 7:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Unknown!");


       /* int languageOption = 5;
        String greetingMessage = ""; // assigning a empty String value

        if (languageOption == 1) {
            greetingMessage = "Hello";
        } else if (languageOption == 2) {
            greetingMessage = "Salam";
        } else if (languageOption == 3) {
            greetingMessage = "Hola";
        } else if (languageOption == 4) {
            greetingMessage = "Privet";
        } else if (languageOption == 5) {
            greetingMessage = "Merhaba";
        } else if (languageOption == 6) {
            greetingMessage = "Szia";
        } else if (languageOption == 7) {
            greetingMessage = "Bonjour";
        } else {
            greetingMessage = "!!!";

        */
        }
    }
}
