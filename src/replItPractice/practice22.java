package replItPractice;

import java.util.Scanner;

public class practice22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String item3 = scan.next();
        double price3 = scan.nextDouble();
         double totalPrice= (price1+price2+price3);
        String report = "Item1: "+item1+" Price:"+" "+price1+","+" "
                +"Item2: "+ item2+" "+"Price:"+" "+price2+","
                +" "+"Item3: "+item3+" " +"Price: "+price3+"\n"
                +"Total price: "+totalPrice;

        System.out.println(report);

        //         -calculate totalPrice for all items

        // -build the report variable by concatenating Strings and double values:

        // "Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
        // "Total price: 15.3"

        //               - Print the value of report variable

    }
}
