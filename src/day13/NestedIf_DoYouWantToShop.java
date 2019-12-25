package day13;

public class NestedIf_DoYouWantToShop {
    public static void main(String[] args) {
        boolean youWantToShop = true;
        String preference = "Online";
        if (youWantToShop == true) {

            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping!");

            } else {
                System.out.println("Shopping Online");
            }
            } else {
                System.out.println("Good job! Stay at home and code!");
            }
        }

    }



