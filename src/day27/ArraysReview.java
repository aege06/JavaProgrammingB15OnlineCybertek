package day27;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {
  /* Array: a vriable that allows us to store multiple values
                Array's size is fixed
            decleration:
                        Data-Type[] variableName = {data1, data2, ...};
                       each elemnt's data-type is same with Array's data type
            regular variables:
                    we can only store one single value
                        int a = 10;
            array variables:
                    int[] arr ={ 1, 2,  3 };
                    index:       0   1  2
                retrieve data:
                    arrayName[indexNumber] ==> elemnt of that index number
                    EX:
                        arr[2] ==> 3
               Array MUST be converted to String in order to be printed
                Array's size is fixed, must be initialized before we use it
    */

            int num = 10;
            int[] arr = {10, 20, 30, 40, 50, 60};
            // length: returns the total number of elements from the array
            // last index num: arr.length-1
            int num1 = arr[arr.length - 1];
            //               6      -    1   = 5
            System.out.println(num1);
            System.out.println("===================================");
            // expected: 10 20 30 40 50 60
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[x] + " ");
            }
            System.out.println("\n===================================");
            // Arrays.toString(VariableName):
            String str = Arrays.toString(arr);
            System.out.println(str);

        }
    }
