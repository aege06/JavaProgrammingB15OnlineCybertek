package practicesunday;

public class ArrayPractice2Dimensional {
    public static void main(String[] args) {
        int[][] data ={ {12,5,4},{23,113,32} };

        System.out.println(data[0][0]);
        System.out.println(data[0][1]);
        System.out.println(data[0][2]);
        System.out.println(data[1][0]);
        System.out.println(data[1][1]);
        System.out.println(data[1][2]);

        for (int i = 0; i < data.length; i++) {
            System.out.println("*******Row : "+ i);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();

            }
        for (int[] rows : data) {
            System.out.println("*******Row : ");
            for (int columnData : rows) {
                System.out.print(columnData + " ");
            }
            System.out.println();

    }
    }
}
