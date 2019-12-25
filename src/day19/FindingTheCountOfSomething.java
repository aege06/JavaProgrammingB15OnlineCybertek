package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        //   int counter=0;
        //    for (int i = 1; i <= 100; i++) {
        //       if (i % 15 == 0) {
        //         System.out.println(i);
        //         ++counter;

        //   System.out.println("counter= " +counter);

        String name = "Esra Fidan";
        int countOfA = 0;
        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.charAt(x));
            if (name.charAt(x) == 'a') {
                System.out.println("BINGO FOUND IT !!");
                ++countOfA;
            }
            System.out.println("countOfA = " + countOfA);
        }
    }
}



