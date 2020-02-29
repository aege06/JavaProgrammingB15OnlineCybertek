package practicesunday;

public class MethodWithNoReturnType {
    public static void main(String[] args) {
        String name="Aliya";
        System.out.println(name.charAt(0));
     //   System.out.println(printSomething()); no value to return so it does not compile

    }
    public static void printSomething(){
        System.out.println("CLASS IS OVER");
    }
}
