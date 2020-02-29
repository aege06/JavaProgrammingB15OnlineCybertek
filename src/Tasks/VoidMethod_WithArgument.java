package Tasks;

public class VoidMethod_WithArgument {
    public static void main(String[] args) {
        OddOrEven(10);
        sumOfTwoNums(10,24);
      //  String str="abcabcabc";
        RemoveDuplicates("abcabcabc");

            }
    public static void RemoveDuplicates(String a){
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if (!result.contains(a.substring(i, i + 1))) {
                result += a.substring(i, i + 1);
            }
        }
        System.out.println(result);
    }
        public static void sumOfTwoNums(int a,int b){
            System.out.println("Sum of " +a +" and " +b+ " is: " +(a+b));
        }
        public static void OddOrEven ( int a){
            if (a % 2 == 0) {
                System.out.println(a + " is Even number");
            } else {
                System.out.println(a + " is Odd number");
            }

        }
    }
