package day06;

public class UsingTheValueOfOtherNumbers {
    public static void main(String[] args) {
        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;
        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your favorite number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your favorite number " + yourFavoriteNumber);

    }
}
