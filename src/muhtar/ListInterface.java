package muhtar;

import java.util.*;


public class ListInterface {
    public static void main(String[] args) {
      //  List<Integer>list1=new List<>(); //cannot create object from interface
        List<Integer> list2 = new ArrayList<>();
        List<String> list3 = new LinkedList<>();
        List<Double> list4 = new Vector<>();

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList);

        LinkedList<Integer> linkedList=new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.remove(1);

        System.out.println(linkedList);
        System.out.println("=========================");

        String[] arr = {"A","B","B"};
        List<String> notlinked=new ArrayList<>(Arrays.asList(arr));
        LinkedList<String> linked=new LinkedList<String>(Arrays.asList(arr));
        System.out.println(linked);

        Vector<Integer> vt = new Vector<Integer>();
        vt.add(1);

        System.out.println("=====================================");

        Stack<Integer> st=new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);

        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);








    }
}
