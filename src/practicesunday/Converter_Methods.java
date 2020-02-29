package practicesunday;

public class Converter_Methods {
    public static void main(String[] args) {
        System.out.println(meterToCM(15));
        System.out.println(feetToInch(10));
        System.out.println(fahrToCel(81));
        double cell=fahrToCel(81);
        System.out.println(cell);
        int cel=(int) fahrToCel(81);
        System.out.println(cel);

    }

    public static int meterToCM(int meter) {
        //100 cm=1 m
        return meter * 100;

    }

    public static double feetToInch(int feet) {
        double inch = feet * 12;
        return inch;

    }

    public static double fahrToCel(double fahr) {
        return(fahr-32)*5/9;
    }
}
//create a method called meterToCM
//it takes one int as a parameter and return CM
//create a method called feetToInch
//