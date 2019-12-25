package day09;

public class LanguagePicker {
    public static void main(String[] args) {
        int languageOption = 5;
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

        }

        System.out.println( greetingMessage + " Batch 15 ");

        /* Scanner input=new Scanner(System.in);
        String languageOption = "";
        System.out.println("Enter a value :");
        int value = input.nextInt();
        if(value == 1){
            languageOption ="Hello";
        }else if(value == 2){
            languageOption= "Salam";
        }else if(value == 3) {
            languageOption = "Hola";
        }else if(value == 4) {
            languageOption = "Privet";
        }else if(value == 5){
            languageOption ="Merhaba";
        }else if(value == 6){
                languageOption ="Szia";
            }else if(value == 7){
                languageOption = "bonjour";
            }else {
               languageOption ="unknown" ;}
            System.out.println(languageOption + " , SDET"); */
    }
}
