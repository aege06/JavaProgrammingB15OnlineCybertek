package day17;

import java.util.Scanner;

public class ReversePrintString {
    public static void main(String[] args) {
       /*     Scanner scan = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = scan.nextLine();
            int nameLength = name.length() - 1;
            while ((nameLength >= 0)) {
                System.out.print(name.charAt(nameLength));
                --nameLength;
            }
*/
            String name1="Aysegul";
            int x= name1.length()-1;
            while(x>=0){
                System.out.println("index " +x+ " : " +name1.charAt(x));
                --x;
            }
        }

    }

