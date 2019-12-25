package day33;
/*Create a class called ReturnKeywordPractice with main
calculateAndReturnAge
Write a method accept a birth year and return the age :
the birth year should be within the range of 1900-2020
if not return 0

optionally : test your code against array of birthYears
{1999,122,2019, 1987, 1978,1964,3999, 2004}*/

import java.util.Scanner;

public class ReturnKeyWordPractice {
    public static void main(String[] args) {
        System.out.println(calculateAndReturnAge());
    }

public static int calculateAndReturnAge(){
        Scanner scan = new Scanner(System.in);
        int year=scan.nextInt();
        if(year>=1900 && year<=2020){
        return 2020-year;
        }else{
        return 0;
        }
        }
    }


