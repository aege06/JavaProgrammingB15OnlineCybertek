package practicesunday;

public class MethodsReturnAValue {
    public static void main(String[] args) {
        boolean result = isAdultOrNot(19);
        System.out.println(result);
        System.out.println(isAdultOrNot(16));
int biggerNum=giveMeBiggerNumber(10,12);
        System.out.println(biggerNum);
        System.out.println(giveMeBiggerNumber(100,11));
    }

    //create a method called isAdultOrNot
    //it takes one int as a parameter and return a boolean
    //inside body--> if the number passed is more than 18 return true
    //else return false
    //call your method couple times and print out the result
    //either by saving it or directly storing it
    public static boolean isAdultOrNot(int age) {
        if (age > 18) {
            return true;
        }else{
            return false;
        }
    }
    public static int giveMeBiggerNumber(int num1, int num2){
      int max=(num1>num2)? num1:num2; //ternary operator
      return max;
      //or return (num1>num2)? num1:num2;

        }
    }

