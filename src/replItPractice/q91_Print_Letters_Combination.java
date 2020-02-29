package replItPractice;

public class q91_Print_Letters_Combination {
    public static void main(String[] args) {
        for (char i='z'; i>='v'; i--) {
            for (char k='z'; k>='v'; k--) {
                System.out.println(""+i+k);
            }
        }
    }
}
