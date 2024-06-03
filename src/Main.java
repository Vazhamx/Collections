import Vazhmax.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        System.out.println(list1.equals(list2));

    }
}
