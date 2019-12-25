package day11;

public class WarmUp_LightOnOff {
    public static void main(String[] args) {

   String targetOption = "";

        switch (targetOption) {

            case "Bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "Lr":
                System.out.println("You have turned on living room light");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Ha":
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("There is no such a light");
                break;
        }

    }
}
