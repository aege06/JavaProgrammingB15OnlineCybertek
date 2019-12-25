package day15;

public class LordOftheRing {
    public static void main(String[] args) {
        String movie="Lord Of The Ring";
        System.out.println(movie.substring(12,16) + " " + movie.substring(5,7) + " " +
                movie.substring(8,11 ) + " " + movie.substring(0,4));

        String wordRing =movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);

        System.out.println(wordRing+wordOfThe+wordLord);
        System.out.println();



    }

}
