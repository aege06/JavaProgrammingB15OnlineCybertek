package day20;

public class GetSiblingChar {
    public static void main(String[] args) {

        // given a String with even number character count
// print 2 characters in one line as below example
//
// for example  :  Ayra
/*
    Ay
    yr
    ra
    }

 */
        String name = "Nisa";
        int charCount = name.length();
        int lastCharIndex = charCount - 1;

        for (int x = 0; x <= charCount - 2; x += 2) {
            System.out.println(name.substring(x, x + 2));
        }
    }
}

