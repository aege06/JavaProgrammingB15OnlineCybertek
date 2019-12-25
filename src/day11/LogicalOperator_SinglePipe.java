package day11;

public class LogicalOperator_SinglePipe {
    public static void main(String[] args) {
        System.out.println(5>10 && 9/0==3);
        //  System.out.println(5>10 & 9/0==3); gives error

        System.out.println(10 > 5 || 9 / 0 == 3);
       // System.out.println(10 > 5 | 9 / 0 == 3); gives error

    }
}
