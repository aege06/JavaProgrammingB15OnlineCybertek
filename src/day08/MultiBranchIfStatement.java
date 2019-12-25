package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int currentSpeed = 45;

        if ( currentSpeed > 60) {
            System.out.println("You are speeding more than 60 --POINTS TAKEN!!!");

        }else if ( currentSpeed>70) {
            System.out.println("Your speed is less than 70 but more than 60 ");

        } else {
            System.out.println("KEEP DRIVING! YOU ARE GOOD!!!");
        }
    }
}
