package day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name="Aysegul";
        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i)=='e'){
                break;
            }
            System.out.println(name.charAt(i));
        }


            }
    }
