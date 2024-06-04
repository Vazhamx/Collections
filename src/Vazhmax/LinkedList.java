package Vazhmax;

import java.util.*;

@SuppressWarnings("unchecked")
public class LinkedList<T> implements List<T> {
    private Node head;
    
    @Override
    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    @Override
    public void clear() {
        head = null;
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        for (int i = 0; i < size(); i++) {
            if (current.value.equals(o))
                return true;
            current = current.next;
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        //TODO containsAll()
        return false;
    }
    
    @Override
    public T get(int index) {
        if(index >= size())
            throw new ArrayIndexOutOfBoundsException(index);
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return (T) current.value;
    }
    
    @Override
    public boolean add(T t) {
        if (isEmpty()) {
            head = new Node(t);
        } else {
            Node newNode = new Node(t);
            Node previous = getNode(size() - 1);
            previous.next = newNode;
        }
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index >= size()) 
            throw new ArrayIndexOutOfBoundsException(index);
        Node previous = getNode(index - 1);
        previous.next = new Node(element, previous.next);
    }
    
    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        T oldElement = get(index);
        getNode(index - 1).next = new Node(element, getNode(index + 1));
        return oldElement;
    }
    
    @Override
    public T remove(int index) {
        if(index == 0) {
            head = head.next;
            return (T) head.value;
        }
        else if(index >= size()) 
            throw new ArrayIndexOutOfBoundsException(index);
        T oldElement = get(index);
        getNode(index - 1).next = getNode(index).next;
        return oldElement;
    }
    
    @Override
    public boolean remove(Object o) {
        if (!contains(o))
            return false;
        remove(indexOf(o));
        return true;
    }
    
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    
    @Override
    public int indexOf(Object o) {
        Node current = head;
        for (int i = 0; i < size(); i++) {
            if (current.value.equals(o)) {
                return i;
            }
            current = current.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        //TODO lastIndexOf()
        return 0;
    }
    
    @Override
    public Iterator<T> iterator() {
        //TODO Iterator()
        return null;
    }
    
    @Override
    public ListIterator<T> listIterator() {
        //TODO listIterator()
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        //TODO listIterator()
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        //TODO subList()
        return List.of();
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size()];

        Node current = head;
        for (int i = 0; i < size(); i++) {
            result[i] = current.value;
            current = current.next;
        }

        return result;
    }
    
    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) toArray();
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        Node currentNode = head;
        StringBuilder stringBuilder = new StringBuilder("[");
        while (currentNode != null) {
            stringBuilder.append(currentNode.value).append(", ");
            currentNode = currentNode.next;
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        LinkedList<?> list = (LinkedList<?>) obj;
        if(list.size() != this.size()) 
            return false;
        for(int i = 0; i < this.size(); i++){
            if(list.get(i) != this.get(i)) 
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(toArray());
    }

    private Node getNode(int index) {
        int counter = 0;
        Node current = head;
        while (counter != index) {
            current = current.next;
            counter++;
        }

        return current;
    }
}
