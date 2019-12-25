package day21;

public class StarTreeWithLoop {
    public static void main(String[] args) {

        int lineCount = 30;
        int maxLineNum = (lineCount + 1) / 2;
        for (int i = 1; i <= maxLineNum; i++) {
            for (int space = 1; space <= maxLineNum - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= (i * 2) - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
