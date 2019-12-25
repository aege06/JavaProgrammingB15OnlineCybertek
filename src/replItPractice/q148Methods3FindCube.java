package replItPractice;

import java.util.Scanner;

public class q148Methods3FindCube {
    //Given method called cube.
    // Write all required code inside this method in order  to asks the user
    // for a number and then prints the cubed value of that number:
    public static void cube(){
        Scanner scan=new Scanner (System.in);
        int num=scan.nextInt();
        System.out.println(num*num*num);

    }

    public static void main(String[] args) {
        cube();
    }
}
