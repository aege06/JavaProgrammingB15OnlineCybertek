package Tasks;

public class ArrayTaskMuhtar {
    public static void main(String[] args) {



        int[] arr={20,200, 3, 40, 50, 500};
        int maximum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>maximum){
                maximum=arr[i];


            }

        }
        System.out.println("Maximum number is: "+ maximum);

        int secondMax=0;
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]>secondMax && arr[j]<maximum){
                secondMax=arr[j];
            }

        }
        System.out.println("Second maximum number is: "+secondMax);
        
        int min=0;
      //  for (int k = 0; k < ; k++) {
            
        }

    }

