package Vazhmax;

class Node {
    Object value;
    Node next;

    Node(Object value) {
        this.value = value;
    }

    Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
