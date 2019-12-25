package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        System.out.println("Java".equals("java"));
        //this is something that you will rarely use

        String myStr = "Java";

        System.out.println( myStr.equals("Java"));

        String yourStr = new String ( "Java");

        System.out.println("Is my string same as your string ? ");
        System.out.println(myStr.equals(yourStr));

        if( myStr.equals("Java")) {
            System.out.println("CORRECT WORD!!!!");
        }else{
            System.out.println("SAY JAVA!!!!!");
        }


    }
}
