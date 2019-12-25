package officeHour;

import java.util.Scanner;

public class Practice_11_26_NestedIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want food or drink?");
        String mainOptions= scan.next();
        System.out.println("Do you want meal or snack?");
        String secondaryOption=scan.next();
        if(mainOptions.equalsIgnoreCase("food")){
        System.out.println("You have selected food");
        if(secondaryOption.equalsIgnoreCase("snack")){
            System.out.println("YOU HAVE SELECTED SNACK");
        }else if(secondaryOption.equalsIgnoreCase("MEAL")) {
            System.out.println("YOU HAVE SELECTED MEAL");
        }else{
            System.out.println("NO SUCH FOOD OPTION");
        }


    }
}
}
