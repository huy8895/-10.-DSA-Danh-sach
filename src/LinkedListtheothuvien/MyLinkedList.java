package LinkedListtheothuvien;

import com.sun.xml.internal.ws.util.xml.CDATA;
import org.w3c.dom.CDATASection;

public class MyLinkedList<E> {
    private int numNode;
    private Node head;


    private class Node {
        Node next;
        Object data;

        private Node(Object data) {
            this.data = data;
        }

        private Object getData() {
            return this.data;
        }

    }

    public MyLinkedList(Object data) {
        head = new Node(data);

    }

    public String toString() {
        Node temp = head;

        StringBuilder result = new StringBuilder("[" + head.data);

        for (int i = 0; i < numNode; i++) {
            temp = temp.next;
            if (temp != null) result.append(", ");
            result.append(temp.data);

        }

        return result.toString() + "]";
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        if (index == 0) {
            addFirst(data);
        } else if (index == numNode){
            addLast(data);
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNode++;
        }

    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;

    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new Node(data);
        numNode++;


    }

   public void remove(int index) {
        Node removeElement = head;
        Node holder;
        if (index == 0){
            removeFirst();
        } else if (index == numNode){
            removeLast();
        } else {
            removeElement = head;
            int i = 0;
            while (i < index - 1){
                removeElement = removeElement.next;
                i++;
            }
            removeElement.next = removeElement.next.next;
            numNode--;
        }

    }

    public void removeFirst(){
        head = head.next;
        numNode--;
    }

    public void removeLast(){
        Node temp = head;
        int i = 0;
        while (i < numNode - 1){
            temp = temp.next;
            i ++;
        }
        temp.next = null;
        numNode--;

    }

    /*public boolean remove(Object object) {
        return false;
    }

    public int size() {
        return 0;
    }

    public E clone() {
        return E;
    }

    public boolean contains(E element) {
        return false;
    }

    public int indexOf(E element) {
        return 0;
    }

    public boolean add(E element) {
        return false;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int index) {

    }

    public E getFirst() {

    }

    public E getLast() {
        E
    }

    public void clead() {

    }
*/

}
