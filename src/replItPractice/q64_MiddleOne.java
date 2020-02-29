package replItPractice;

import java.util.Scanner;

public class q64_MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
//        You have a word, do the following:
//
//        1. When word has odd number of characters and:
//        - 3 or more characters, print middle letter
//        oak ==> a
//        javav ==> v
//                - Single character, print that character 3 times
//      # ==> ###
//        q ==> qqq
//
//        2. When word has even number of characters and:
//        - 4 or more characters, print middle 2
//        java ==> av
//        apples ==> pl
//     #$%^&* ==> %^
//        - 2 characters, print those 2 characters twice
//        @@ ==>@@@@
//                $$ ==>$$$$
//        hi ==> hihi

            if(word.length()%2!=0 && (word.length()>=3)){
                System.out.println(word.charAt(word.length()/2));
            if(word.length()==1){
                System.out.println(word+word+word);
            }
            if(word.length()%2==0 && (word.length()>=4)){
                    System.out.println(word.charAt(word.length()/2)+1);
                }




        }
}
}
/*
int charCount=word.length();

if (charCount==1){
System.out.println(word+word+word);
}else if (charCount==2){
System.out.println(word+word);
}else if (charCount>2){
if (charCount%2==1){
int indexOfMidCharacter=charCount/2;
System.out.println(word.charAt (indexOfMidCharacter));
}else{
int indexOfFirstHalf=charCount/2-1;
int indexOfSecondHalf=charCount/2;

System.out.println(word.charAt(indexOfFirstHalf)+""+word.charAt(indexOfSecondHalf));

}
word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2))

}*/