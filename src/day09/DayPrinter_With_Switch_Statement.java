package day09;

public class DayPrinter_With_Switch_Statement {
    public static void main(String[] args) {

        int dayCode =9;
        switch (dayCode) {
            case 1:
                System.out.println("Day is Monday");
                break;//used to get out of this branch
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Day is unknown!");

        }


      /*  int dayCode = 7;

        if (dayCode == 1) {
            System.out.println("Day is Monday");
        } else if (dayCode == 2) {
            System.out.println("Day is Tuesday");
        } else if (dayCode == 3) {
            System.out.println("Day is Wednesday");
        } else if (dayCode == 4) {
            System.out.println("Day is Thursday");
        } else if (dayCode == 5) {
            System.out.println("Day is Friday");
        } else if (dayCode == 6) {
            System.out.println("Day is Saturday");
        } else if (dayCode == 7) {
            System.out.println("Day is Sunday");
        } else {
            System.out.println("Day is Unknown");
//        }

       */
    }
}
