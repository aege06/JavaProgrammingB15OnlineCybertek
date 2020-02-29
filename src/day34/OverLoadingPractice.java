package day34;

public class OverLoadingPractice {
    public static void main(String[] args) {
        add(10);
        add(10,20);
        add(10,20,30);
        add(40L,50L);
    }
    public static void add(int num1){
        System.out.println(num1+100);
    }
    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    public static void add(long a,long b){
        System.out.println(a+b);
    }


}
/*Create a class called OverloadingPractice
create 4 static void overloaded version of add method
	1, add
		has 1 int parameter and add 100 to that number
		and print out the result
	2, add
		has 2 int parameters and add them to get sum
		and print out the result
	3, add
		has 3 int parameters and add them to get sum
		and print out the result
	4, add
		has 2 long parameters and add them to get sum
		and print out the result */