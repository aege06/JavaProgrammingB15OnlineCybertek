package day33;

public class SumOfNumsReturn {
    public static void main(String[] args) {
        /**
         * getSumFrom1toX
         * This method should calculate the sum of
         * the numbers from 1 to the number user passed
         * @param x final number to be added
         * @return the sum of numbers from 1 to x as int
         */
        System.out.println("Sum is "+getSumFrom1toX(5));
    }

    public static int getSumFrom1toX(int x){
        int sum =0;
        for (int i = 1; i <=x ; i++) {
            sum+=x;
        }
        return sum;
    }
    }


