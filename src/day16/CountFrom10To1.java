package day16;

public class CountFrom10To1 {
    public static void main(String[] args) {
        int count=10;
        while(count>=1){
            System.out.println(count);
            --count;
        }
        System.out.println("Final value of count is " +count);
    }
}
