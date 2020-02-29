package muhtar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions_Review {
    public static void main(String[] args) {
      //  throw new ClassCastException();//unchecked exception, compiler is okay with it
       // throw new FileNotFoundException();//checked exception compiler is not happy with it
        try {
           // FileInputStream file = new FileInputStream("path of file");
            Thread.sleep(3000);
            System.out.println("try block");
        } catch (InterruptedException e) {
            System.out.println("catch block");
        }
        System.out.println("===========================");
try {
    System.out.println(11 / 0);
}catch (ArithmeticException e){
    e.printStackTrace();
    System.out.println("catch block");

}
    System.out.println("next test step");
        System.out.println("=====================");
        int[] arr={1,2,3};
        try {
            System.out.println(arr[200]);
        }catch(NullPointerException e) {
            System.out.println(1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(2);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(3);
        }catch(Exception e){
            System.out.println(4);

        }
        // method();
       // method2();
        //method3();
       // method4();
       // method5();

        int breaktime=0;
        if(breaktime==0){
            throw new RuntimeException("Time to go home!");

        }
        System.out.println("Done");
    }

    public static void method() throws InterruptedException{
        Thread.sleep(3000);
    }
    public static void method2(){
        try {
            Thread.sleep(3000);
        }catch(Exception e){

        }
    }
    public static void method3() throws Exception{

    }
    public static void method4() throws RuntimeException{
        System.out.println(9/0);
    }
    public static void method5(){
        throw new RuntimeException();
    }

}
