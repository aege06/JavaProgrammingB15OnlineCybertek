package replItPractice;

import java.util.Scanner;

public class q125_ArraysShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String min=str[0];
        for (int i = 0; i <str.length ; i++) {
            if(str[i].length()<min.length()){
                min=str[i];
            }
        }
        System.out.println(min);
    }
}
