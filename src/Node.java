package src;

public class Node<E> {

    E data;
    Node<E> next;

    // Constructor
    Node() {

    }

    Node(E d) {
        data = d;
        next = null;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
