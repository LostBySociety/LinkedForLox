package src;

public class Node<E> {

    E data;
     Node<E> next;
     Node<E> prev;

    // Constructor
    Node() {

    }

    Node(E d) {
        data = d;
        next = null;
    }

    public void setNext(Node<E> next) {
        next = next;
    }

    public void setPrev(Node<E> prev) {
        prev = prev;
    }

}
