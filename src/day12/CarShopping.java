package day12;

public class CarShopping {
    public static void main(String[] args) {

        //Buy Corolla
        String carBrand = "Corolla";
        int carPrice= 60000;
        int budget = 40000;

        if( carBrand.equals("Corolla") ||  (carBrand.equals("Tesla")&& carPrice<=budget) ) {
            System.out.println("Car Acquired!!");
        }else{
            System.out.println("Not what I am looking for!!!");
        }


        }
    }

