package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        int num; // we are declaring a variable
        num=10; // we are assigning a value on different line
        int[] ages=new int[]{3,5,11,33,57,18};
        //or directly
        //  int[] ages={3,5,11,33,57,18};
        int itemCount=ages.length;
        System.out.println("itemCount = " +itemCount );
        System.out.println("ages" +ages);
        for (int x = 0; x <itemCount ; x++) {
            System.out.println(ages[x]);

        }
        int[] areCodes={703,300,954,665};
        for (int x = 0; x <areCodes.length ; x++) {
            System.out.print(areCodes[x]+ " ");

        }
    }
}









