package practicesunday;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopWithArrayList {
    public static void main(String[] args) {
        String sentence="flapjacks are awesome!!";
        Scanner scan=new Scanner(sentence);
       // ArrayList<String>words=new ArrayList<String>();
        ArrayList words = new ArrayList();
        while(scan.hasNext()){
            words.add(scan.next());

        }
        System.out.println(words);
    }
}
