package Third_Lab;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/25/2022.
 */
public class SinglyLinkedList<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public SinglyLinkedList() {
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int Size(){
        return size;
    }

    public E First(){
        if (isEmpty())return null;
        return head.getElement();
    }
    public E Last(){
        if (isEmpty())return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head=new Node<E>(e,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addLast(E e){
        Node<E>newest= new Node<E>(e,null);
        if (isEmpty())
            tail=head;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }

    public E removeFirst(){
        if (isEmpty())return null;
        E x= head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return x;
    }

    public static class Node<E>{
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}