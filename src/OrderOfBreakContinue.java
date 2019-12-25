import jdk.swing.interop.SwingInterOpUtils;

public class OrderOfBreakContinue {
    public static void main(String[] args) {
        for (int x = 1; x <=10; x++) {
           // break;
          continue;
            //This will not work! Unreachable code
          // System.out.println("HELLO");

        }
        System.out.println("THE END");
    }
}
