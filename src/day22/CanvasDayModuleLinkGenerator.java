package day22;

public class CanvasDayModuleLinkGenerator {
    public static void main(String[] args) {
        String baseURL="https://learn.cybertekschool.com/courses/278/modules#";
        String message="this will lead you to day ";
        for (int day = 21; day <=56 ; day++) {
            System.out.println(message+day+ " " +baseURL+ (3317-21 +day));

        }

    }

}
    //Akbar's solution and explanation

        /*Here is the direct links to lead you to correct days
https://learn.cybertekschool.com/courses/278/modules#3317
this will lead you to day 21
https://learn.cybertekschool.com/courses/278/modules#3318
this will lead you to day 22
https://learn.cybertekschool.com/courses/278/modules#3319
this will lead you to day 23
https://learn.cybertekschool.com/courses/278/modules#3320
this will lead you to day 24
and so on          Here is the direct links to lead you to correct days
      https://learn.cybertekschool.com/courses/278/modules#3317
      this will lead you to day 21
      https://learn.cybertekschool.com/courses/278/modules#3318
      this will lead you to day 22
      https://learn.cybertekschool.com/courses/278/modules#3319
      this will lead you to day 23
      https://learn.cybertekschool.com/courses/278/modules#3320
      this will lead you to day 24
      and so on
      So write a program to generate the links to
      lead you to the right module of the day from day 21 all the way till day 56
  * */
        //public static void main(String[] args) {

         //   String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
          //  String dayMsg = "This will lead you to day ";


//        for (int moduleNumber = 3317; moduleNumber <=3317+35 ; moduleNumber++) {
//            System.out.println(moduleNumber);
//        }
//        for (int day = 21; day <= 56; day++) {
//
//            System.out.println(dayMsg + day);
//            //  if day is 21 the number is 3317 according to requirement
//            //  if day is 22 the number is 3318 according to requirement
//
//            System.out.println(baseURL + (3317 - 21 + day));
//
//        }

            // 3297 is first day module ID BECAUSE I TOLD YOU SO
            // get the link from day 1 till day 22
         //   for (int day = 1; day <= 22; day++) {

              //  System.out.println(dayMsg + day);
                //  if day is 1 the number is 3297 according to requirement
                //  if day is 2 the number is 3298 according to requirement

              //  System.out.println(baseURL + (day + 3296));*/


