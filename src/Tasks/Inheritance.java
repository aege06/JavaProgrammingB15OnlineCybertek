package Tasks;
class TestBase{
    static String chromeDriver="FireFox";//default
    public static void TakeScreenShot(){
        System.out.println("Took screenshot");
    }
    private static void closeBrowser(){
    System.out.println("Browser closed");
}
}

public class Inheritance extends TestBase {
              //sub             //super
    //sub class will inherit all the visible or protected features from the super class
           //   static String chromeDriver;
   // public static void TakeScreenShot(){
     //   System.out.println("Took screenshot");
    //}


    public static void main(String[] args) {
        System.out.println(chromeDriver);
      TakeScreenShot();
    }
}
