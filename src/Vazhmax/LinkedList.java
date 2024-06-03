package Vazhmax;

import java.util.Objects;

public class LinkedList {
    private Node head;
    private boolean isEmpty = true;
    
    public int get(int index){
        int counter = 0;
        Node currentValue = head;
        while(counter != index) {
            if(currentValue.nextElement == null){
                throw new ArrayIndexOutOfBoundsException();
            }
            currentValue = currentValue.nextElement;
            counter++;
        }
        return currentValue.value;
    }
    
    public void add(int value){
        if(isEmpty){
            head = new Node(value);
            isEmpty = false;
        }
        else{
            Node currentNode = head;
            Node newNode = new Node(value);
            while (currentNode.nextElement != null) {
                currentNode = currentNode.nextElement;
            }
            currentNode.nextElement = newNode;
        }
    }
    
    

    public void add(int index, int value){
        //TODO index add
    }

    public int length() {
        if(isEmpty) return 0;
        Node currentNode = head;
        int length = 0;
        while (currentNode != null) {
            currentNode = currentNode.nextElement;
            length++;
        }
        
        return length;
    }

    @Override
    public String toString() {
        if(isEmpty) return "[]";
        Node currentNode = head;
        StringBuilder stringBuilder = new StringBuilder("[");
        while(currentNode != null){
            stringBuilder.append(currentNode.value).append(", ");
            currentNode = currentNode.nextElement;
        }
        stringBuilder.delete(stringBuilder.length() -2, stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        LinkedList list = (LinkedList) obj;
        if(length() != list.length()) return false;
        for (int i = 0; i < length(); i++){
            if(get(i) != list.get(i))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(head.value);
    }
}
