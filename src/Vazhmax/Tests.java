package Vazhmax;

import java.util.List;

public class Tests {
    /* work methods:
     * size()
     * clear()
     * isEmpty()
     * contains()
     * get()
     * add() | both
     * remove() | both
     * indexOf()
     * toArray() | both
     * toString()
     * equals()
     * hashCode()
     */
    public static void main(String[] args) {
        // put test here
    }
    
    public static void sizeTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);
        
        System.out.println("List size: " + list.size());
    }
    
    public static void clearTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);
        
        System.out.println("Clear list: ");
        list.clear();
        
        System.out.println("List: " + list);
    }

    public static void isEmptyTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);
        
        System.out.println("Is list empty: " + list.isEmpty());
        
        list.clear();
        System.out.println("Clear list");
        
        System.out.println("List: " + list);
        System.out.println("Is list empty: " + list.isEmpty());
    }
    
    public static void containsTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);

        System.out.println("list contains 5: " + list.contains(5));
        System.out.println("list contains 6: " + list.contains(6));
    }
    
    public static void getTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);
        
        System.out.println("Get first: " + list.getFirst());
        System.out.println("Get last: " + list.getLast());
        System.out.println("Get element with index 3: " + list.get(3));
        System.out.println("Get element out of bounds: ");
        list.get(5);
    }
    
    public static void addTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);
        
        System.out.println("Add 23 to list: ");
        list = initList();
        list.add(23);
        System.out.println("List: " + list);
        
        System.out.println("Add 12 to index 3");
        list = initList();
        list.add(3,12);
        System.out.println("List: " + list);

        System.out.println("Get element out of bounds: ");
        list.add(8,9);
    }
    
    public static void removeTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);

        System.out.println("Remove int=5: ");
        list.remove((Integer) 5);
        System.out.println("List: " + list);

        list = initList();
        System.out.println("Remove int with index 2: ");
        list.remove(2);
        System.out.println("List: " + list);

        list = initList();
        System.out.println("Remove first: ");
        list.removeFirst();
        System.out.println("List: " + list);

        list = initList();
        System.out.println("Remove last: ");
        list.removeLast();
        System.out.println("List: " + list);

        System.out.println("Remove element out of bounds: ");
        list.remove(12);
    }
    
    public static void indexOfTest(){
        List<Integer> list = initList();
        System.out.println("List: " + list);

        System.out.println("Index of 6: " + list.indexOf(6));
        System.out.println("Index of 20: " + list.indexOf(20));
    }
    
    private static List<Integer> initList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        return list;
    }
}
