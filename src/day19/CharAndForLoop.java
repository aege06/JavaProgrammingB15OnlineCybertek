package day19;

import jdk.swing.interop.SwingInterOpUtils;

public class CharAndForLoop {
    public static void main(String[] args) {
      //  int x= 'A';
      //  char myChar=100+1;
      //  System.out.println(x);
      //  System.out.println(myChar);

        char myChar2='A';
        System.out.println(myChar2);
        System.out.println(++myChar2);
        System.out.println(++myChar2);
        System.out.println(++myChar2);
        System.out.println(++myChar2);

        System.out.println('A'>'B');
        System.out.println('z'>'B');

        for( char iChar= 'A'; iChar<='Z'; iChar++ ){
            System.out.print(iChar+ " ");

        }

        System.out.println();
        for(char kChar='Z'; kChar>= 'A'; kChar--){
            System.out.print(kChar+ " ");
        }



    }
}
