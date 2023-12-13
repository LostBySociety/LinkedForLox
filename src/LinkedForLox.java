package src;

public class LinkedForLox<E>{
    Node<E> first;
    public LinkedForLox<E> add(LinkedForLox<E> list, E data){
        Node<E> node = new Node<>(data);
        if (list.first==null) {
            list.first = node;
        } else {
           Node<E> last = first;
           while(last.next!=null){
               last=last.next;
           }
           last.next = node;
        }
        return list;
    }
    public Node<E> get(LinkedForLox<E> list, int index) throws IndexOutOfBoundsException{
        int count = 0;
        Node<E> node = list.first;
        while(node!=null){
            if (count == index){
                return node;
            } else{
                node = node.next;
                count++;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public LinkedForLox<E> set(LinkedForLox<E> list, Node<E> newNode, int index) throws IndexOutOfBoundsException{
        int count = 0;
        Node<E> node = list.first;
        while(node!=null){
            if (count == index){
                node = newNode;
                return list;
            } else{
                node = node.next;
                count++;
            }
        }
        throw new IndexOutOfBoundsException();
    }
    public LinkedForLox<E> remove(LinkedForLox<E> list, int index){
        Node<E> node = list.first;
        Node<E> prev = null;
        if (index==0 && node!= null){
            list.first = node.next;
            return list;
        }
        int count = 0;
        while (node!=null){
            if (count==index){
                prev.next=node.next;
                break;
            } else{
                prev = node;
                node=node.next;
                count++;
            }
        }
        return list;
    }
}


