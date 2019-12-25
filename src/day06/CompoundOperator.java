package day06;

import jdk.swing.interop.SwingInterOpUtils;

public class CompoundOperator {
    public static void main(String[] args) {
       // int studentOnLine = 263;
        //  studentOnLine = studentOnLine + 5;
     //   System.out.println("5 people joined  the class " + studentOnLine);

     //   studentOnLine = studentOnLine - 3;

    //    System.out.println("5 people left the class "+studentOnLine);

     //   studentOnLine = studentOnLine*2;
    //    System.out.println("The student count doubled " +studentOnLine);

    //    studentOnLine = studentOnLine/3;
//  //      System.out.println("The student number dropped to 1/3 " +studentOnLine);
        int studentOnLine = 263;

        studentOnLine += 5;
        System.out.println("5 people joined the class" +studentOnLine);
        studentOnLine -= 3;
        System.out.println("5 people left the class "+studentOnLine);
        studentOnLine *=2;
        System.out.println("The student count doubled " +studentOnLine);
        studentOnLine /=3;
        System.out.println("The student number dropped to 1/3 " +studentOnLine);


    }
}
