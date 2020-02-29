package replItPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class q72_String_NoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.println(txt.substring(0,txt.length()));

//   in this exercise you get a string called txt .
//output txt without its last letter.
//for example:
//txt = "foo"
//output will be:
//fo
//hint
//use substring() and length() together to solve this.
//substring will start at 0 and will end at txt length -1
    }

}
