package day27;

public class Multi_D_ArraysTask {
    public static void main(String[] args) {
        int[][] numbers={{12,11,10,19}   ,   {19,20,15}};
        int max=numbers[0][0]; //assume taht first element is the max
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(max<numbers[i][j]){
                    max=numbers[i][j];

                }
                System.out.println(max);
            }
            
        }
        
    }
}
