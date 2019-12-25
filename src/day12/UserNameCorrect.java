package day12;


public class UserNameCorrect {
    public static void main(String[] args) {

        String userName = "AYSEGUL" ;
        boolean userNameCorrect = userName.equals("AySeGuL");
        System.out.println(  userNameCorrect );
        boolean  nameCheckIgnoreCase = userName.equalsIgnoreCase("AySeGuL");
        System.out.println(  nameCheckIgnoreCase );





}
}