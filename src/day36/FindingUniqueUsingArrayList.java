package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {
    public static void main(String[] args) {
        int[] nums={11,33,44,33,44,22,22,55,44,33};
        ArrayList<Integer>UniqueList=new ArrayList<>();

        for (int each: nums) {
            System.out.println("each="+each);

            if (!UniqueList.contains(each)) {
                UniqueList.add(each);
            }
        }
        System.out.println("UniqueLst is " +UniqueList);
    }
}
