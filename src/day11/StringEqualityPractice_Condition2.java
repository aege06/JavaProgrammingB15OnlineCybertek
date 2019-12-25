package day11;

import javax.management.MBeanAttributeInfo;

public class StringEqualityPractice_Condition2 {
    public static void main(String[] args) {
        String myStr = "Selenium";

        if( myStr.equals("Java")) {
            System.out.println("CORRECT WORD!!!");

        }else if ( myStr.equals("Cava")) {
            System.out.println("Pumpkin!!!");
        }else {
            System.out.println("NOT JAVA NOR PUMPKIN!!!!!");
        }
    }
}
