package src;

public class LinkedForLox<E>{
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    public void add(E data){
        Node<E> node = new Node<>(data);
        if (first==null) {
            first = node;
            last = first;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }
    public E get(int index) throws IndexOutOfBoundsException {
        Node<E> node = getNode(index);
        return node.data;
    }

    private Node<E> getNode(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node;
        int count;
        if (size / 2 > index) {
            node = first;
            count = 0;
            while (count != index) {
                node = node.next;
                count++;
            }
        } else {
            node = last;
            count = size - 1;
            while (count != index) {
                node = node.prev;
                count--;
            }
        }
        return node;
    }

    public void set(E data, int index) throws IndexOutOfBoundsException {
        Node<E> node = getNode(index);
        node.data = data;
    }

    public void remove(int index){
        Node<E> newNode = null;
        if (index == 0 && first != null){
            first = first.next;
            size--;
        } else if (index == size - 1) {
            last = last.prev;
            last.next = null;
            size--;
        }else {
            Node<E> node = getNode(index);
            newNode = node.prev;
            newNode.next = node.next;
            size--;
        }
    }
    public void print(){
        Node<E> node = first;
        if (node.next == null) {
            System.out.println("[]");
        } else {
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }
    }
    public int getSize() {
        return size;
    }
}


