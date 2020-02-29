package replItPractice;

import java.util.Scanner;

public class q79_WithoutX {

    //Given a string word, if the first or last chars are 'x' or 'X',
    // print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean a = word.substring(word.length() - 1).equalsIgnoreCase("x");
        boolean b=word.substring(0,1).equalsIgnoreCase("x");
        if(b && a){

            System.out.println(word.substring(1,word.length()-1) );

        }else if(b ){

            System.out.println(word.substring(1) );

        }else if(a){

            System.out.println(word.substring(0,word.length()-1) );

        }else{

            System.out.println(word);
        }

    }
}
// if(word.contains("x") || word.contains("X")){
//          String word1=  word.replace("x", "").replace("X", "");
//            System.out.println(word1);
//        }else{
//            System.out.println(word);