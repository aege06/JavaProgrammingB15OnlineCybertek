package day22;

public class ArrayCharMyName {
    public static void main(String[] args) {
        char[] name = new char[7];
        name[0] = 'A';
        name[1] = 'y';
        name[2] = 's';
        name[3] = 'e';
        name[4] = 'g';
        name[5] = 'u';
        name[6] = 'l';
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);

        //this will actually print the content of char array not memory address and this is only for char array, anything else will print memory address
        System.out.println(name);
    }

    }
