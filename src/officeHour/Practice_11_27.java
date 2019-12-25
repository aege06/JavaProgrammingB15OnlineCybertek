package officeHour;

public class Practice_11_27 {
    public static void main(String[] args) {
        String message = "  I  LOVE JAVA   " ;
        //trim -->> take out spaces at beginning and ending of a String object
        System.out.println("message = <" + message + ">");
        String messageTrimmed =  message.trim();
        System.out.println("message = <" + messageTrimmed + ">");
        
        String emptySpaces="             ";
        System.out.println("emptySpaces = <" + emptySpaces+">");

        String emptySpacesAfterTrimmed= emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is =  " + emptySpacesAfterTrimmed.length() );
        System.out.println("emptySpacesAfterTrimmed is empty??? =  " + emptySpacesAfterTrimmed.isEmpty() );

    }
}
