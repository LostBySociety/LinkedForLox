package src;

public class LinkedForLox<E>{
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    public void add(E data){
        Node<E> node = new Node<>(data);
        if (this.first==null) {
            this.first = node;
            this.last = this.first;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
        this.size++;
    }
    public E get(int index) throws IndexOutOfBoundsException {
        Node<E> node = getNode(index);
        return node.data;
    }

    private Node<E> getNode(int index) {
        if (index > this.size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node;
        int count;
        if (this.size / 2 > index) {
            node = this.first;
            count = 0;
            while (count != index) {
                node = node.next;
                count++;
            }
        } else {
            node = this.last;
            count = this.size - 1;
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
        if (index == 0 && this.first != null){
            this.first = this.first.next;
            size--;
        } else if (index == this.size - 1) {
            this.last = this.last.prev;
            this.last.next = null;
            size--;
        }else {
            Node<E> node = getNode(index);
            newNode = node.prev;
            newNode.next = node.next;
            size--;
        }
    }
    public void print(){
        Node<E> node = this.first;
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


