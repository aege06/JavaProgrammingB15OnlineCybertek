package day15;

public class StringCaseInSensitiveCheck {
    public static void main(String[] args) {
        String name="Arya Stark";
        System.out.println( "name.contains(\"st\") RESULT IS : "
                +name.contains("ST"));

        String upperCaseName = name.toUpperCase();
        System.out.println("upperCaseName contains ST or not? "
                +upperCaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase();
        System.out.println("lowerCaseName contains st or not? "
                +lowerCaseName.contains("st"));
        System.out.println(name.toLowerCase().contains("st"));


    }
}
