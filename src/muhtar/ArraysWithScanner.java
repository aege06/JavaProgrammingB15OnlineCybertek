package muhtar;

import java.util.Scanner;

public class ArraysWithScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int[] scores=new int[5];
        for(int i=0; i<5;i++){
            System.out.println("Enter team "+(i+1) + " score: ");
            scores [i]=scan.nextInt();


        }
        //print all scores in on line
        for(int score:scores){
            System.out.print(score+" ");
        }
        //find the max score

      int max=0;
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i]>max){
                max=scores[i];
            }


        }
        System.out.println("max= " +max);

        }

    }

