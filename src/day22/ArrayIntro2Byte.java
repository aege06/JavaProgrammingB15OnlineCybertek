package day22;

public class ArrayIntro2Byte {
    public static void main(String[] args) {

        byte[] data=new byte[4];

        data[0]=80;
        data[1]=85;
        data[2]=75;
        data[3]=71;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        data[3]=58;
        System.out.println(data[3]);

    }
}