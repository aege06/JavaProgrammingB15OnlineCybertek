package officeHour;

public class practice_12_23 {
    public static void main(String[] args) {
        String word="computer";

    }
    public static String reversedString(String str){
        String reversedString="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString+=str.charAt(i);


        }
        return reversedString;

    }
}
