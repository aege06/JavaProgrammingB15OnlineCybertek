package day15;

public class SubStringPractice {
    public static void main(String[] args) {
              //      0123456789012345
        String movie="Lord Of The Ring";
        String wordOf=movie.substring(5,7);
        System.out.println("wordOf=" +wordOf);
        String wordThe=movie.substring(8,11);
        System.out.println("wordThe= " +wordThe);

       // int startingPoint=movie.indexOf(" " +1);
       // int endingPoint=movie.length()-1;

       // System.out.println("second word till last :"
         //       +movie.substring(startingPoint,endingPoint));
        String secondWordTillLast=movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);
        String secondToLast= movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);
    }
}
