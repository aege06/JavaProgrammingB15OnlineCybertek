package replItPractice;

import java.util.Scanner;

public class q109_ArraysPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].substring(0, 3));
        }
    }
}
