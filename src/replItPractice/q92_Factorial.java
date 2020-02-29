package replItPractice;

import java.util.Scanner;

public class q92_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long factorial=1L;
        for (int i=1; i<=n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

}

