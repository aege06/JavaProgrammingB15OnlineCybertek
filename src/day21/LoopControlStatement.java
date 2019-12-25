package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        int sum=0;
        for(int x=1; x<=10; x++){
            System.out.println("final sum is " +sum);
            System.out.println("If I add " +x + " dollar, it would be " +(sum+x));


            if(sum+x >40){

                break;
            }

            sum=sum+x;
        }
            System.out.println("sum="+sum);

    }
}
