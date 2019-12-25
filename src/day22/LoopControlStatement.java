package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        //            0123456
        String msg = "I struggle with Java I like Java I love Java Everything is Awesome!";
        for (int i = 0; i <= msg.length(); i++) {
            if (i % 2 == 1) {
                continue;
            } else if (i == msg.indexOf("a")) {
                break;
            }
            System.out.print(msg.charAt(i) + " ");



        }
    }
}


