import Vazhmax.LinkedList;

import java.util.List;

public class Tests {
    public static void main(String[] args) {
        /* work methods:
         * size()
         * isEmpty()
         * contains()
         * toArray() | both
         * add(T t)
         * remove(Object o)
         * clear()
         * add(int index, T element)
         * indexOf()
         * toString()
         * equals()
         * hashCode()
         */
        
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        System.out.println("list size = " + list.size());
        System.out.println("list contains 4: " + list.contains(4));
        System.out.println("list contains 6: " + list.contains(6));
        System.out.println("index of 4: " + list.indexOf(4));
        System.out.println("index of 7: " + list.indexOf(7));
        list.remove((Integer) 4);
        System.out.println("After removing 4: ");
        System.out.println(list);
        list.add(3, 7);
        System.out.println("After adding 7 on index 3: ");
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(7);
        list2.add(5);

        System.out.println(list.equals(list2));
        System.out.println(list.hashCode() == list2.hashCode());
    }
}
