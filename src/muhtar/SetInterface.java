package muhtar;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(100, 100, 100));
        System.out.println(list1);// [100,100,100]
        System.out.println(list1.get(0));


        Set<Integer> st1 = new HashSet<>();
        st1.add(100);
        st1.add(100);
        st1.add(100);
        System.out.println(st1); // output [100]
        // System.out.println(str.get(0)); does not compile because set does not have index numbers
        System.out.println("============================");

        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(100);
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(100);

        System.out.println(hashSet);

        Set<Integer>linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(100);
        linkedhashset.add(10);
        linkedhashset.add(5);
        linkedhashset.add(4);

        System.out.println(linkedhashset);

        SortedSet<String> treeSet=new TreeSet<>();
        treeSet.add("Z");
        treeSet.add("Y");
        treeSet.add("X");
        treeSet.add("W");

        System.out.println(treeSet);

        //Task: remove duplicates from an ArrayList and sort

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6));
        Collections.sort(list); // how to sort List
        System.out.println(list);


       // solution 2:
        List<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,9,8,7,6,10,10,10));
        TreeSet<Integer> ts=new TreeSet<>(list2);// treeset sorts and removes the duplicates from the list.
        System.out.println(ts);

        //Task: Write a program that can remove the duplicates from String

        String str="ZZZZYYYXXAAAAABBBCCCDDD";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

     //   TreeSet<String> ts1=new TreeSet<>(Arrays.asList(arr));
        LinkedHashSet<String> ts1=new LinkedHashSet<>(Arrays.asList());

        String result=ts1.toString().replace("[","").replace("]","").replace(",","");
        System.out.println(result);
        //second solution:
        String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString();
        System.out.println(str2);

    }
}
