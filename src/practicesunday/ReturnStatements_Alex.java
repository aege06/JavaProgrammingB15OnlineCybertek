package practicesunday;

public class ReturnStatements_Alex {
    public static void main(String[] args) {

        printMessage();;
        int sum=add(5,8);
        System.out.println(sum);
        String shouting=caps("Why are you reading my diary mom?!");
        System.out.println(shouting);
        int [] awesomeArray=giveMeArrayFromInt(3,7,1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);

    }
    public static void printMessage(){
        System.out.println("This is our first method!");
    }
    public static int add (int a, int b){
        return a+b;

    }
    public static String caps(String s){
        return s.toUpperCase();
    }
    public static int[] giveMeArrayFromInt(int a, int b, int c){
        int[] array=new int[3];
        array[0]=a;
        array[1]=b;
        array[2]=c;
        return array;
    }
}
