package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        String name="Game of Java";
        System.out.println("find out the last location of the letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        System.out.println("find out the last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));

        System.out.println("find out the last location of the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        System.out.println("find out the last location of the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));


            if (name.indexOf("Kawa") > -1) {
                System.out.println(" KAWA FOUND!!!");
            } else {
                System.out.println("NO KAWA - NO PUMPKIN");
            }


        }
    }

