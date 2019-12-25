package day15;

public class ReversingAString {
    public static void main(String[] args) {
        String name="Aysegul";
        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+" "
                +name.charAt(3)+" "+name.charAt(4)+" "
                +name.charAt(5)+" "+name.charAt(6));

        System.out.println(name.charAt(6)+" "+name.charAt(5)+" "+name.charAt(4)+" "
                +name.charAt(3)+" "+name.charAt(2)+" "
                +name.charAt(1)+" "+name.charAt(0));
        int nameLength=name.length();
        int lastCharIndex=nameLength-1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("LAST CHAR IS " + lastChar);
        System.out.println("Last char is on shot " +name.charAt(name.length()-1));



    }
}
