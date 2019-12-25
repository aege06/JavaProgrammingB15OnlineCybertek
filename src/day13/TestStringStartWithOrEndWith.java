package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {
        String name ="Aysegul";

        System.out.println(name.startsWith("Ay"));
        System.out.println(name.startsWith("ay"));
        System.out.println(name.startsWith("rose"));

        System.out.println(name.endsWith("l"));
        System.out.println(name.endsWith("L"));
        System.out.println(name.endsWith("U"));


    }
}
