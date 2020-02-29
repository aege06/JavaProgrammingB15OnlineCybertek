package practicesunday;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        Given List of names with various character count,
//        Remove any name with less than 2 characters
//        and if any name has more than 10 character only keep 10 characters
//        and if it has exactly 5 characters, reverse it
//        Of course, Optionally make a method out of it.
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Aysegul");
        names.add("Ahsen");
        names.add("Asel");
        names.add("Hayrunnisa");
        names.add("HudaverdiNurullah");

        System.out.println("Names " + names);
               namesMethod(names);
    }

    public static void namesMethod(List<String> names) {

        for (int n = 0; n < names.size(); n++) {
            if (names.get(n).length() < 2) {
                names.remove(n);
            }
            if (names.get(n).length() > 10) {
                names.set(n, names.get(n).substring(0, 10));
            }
            if (names.get(n).length() == 5) {
                 String reverse="";
                for (int r = names.get(n).length() - 1; r >= 0; r--) {
                    reverse += names.get(n).charAt(r);
                }
                names.set(n, reverse);
            }

        }
        System.out.println("Names last version " + names);
    }
}
