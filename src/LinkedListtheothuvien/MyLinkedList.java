package LinkedListtheothuvien;

public class MyLinkedList<E> {
    private int numNode;
    private Node head;

    public MyLinkedList() {

    }

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

        int i = 0;
        while (temp.next != null) {
            result.append(", ");
            temp = temp.next;
            result.append(temp.data);
            i++;
        }

        return result.toString() + "]";
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        if (index == 0) {
            addFirst(data);
        } else if (index == numNode) {
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
        Node removeElement;
        Node holder;
        if (index == 0) {
            removeFirst();
        } else if (index == numNode) {
            removeLast();
        } else {
            removeElement = head;
            int i = 0;
            while (i < index - 1) {
                removeElement = removeElement.next;
                i++;
            }
            removeElement.next = removeElement.next.next;
            numNode--;
        }

    }

    public void removeFirst() {
        head = head.next;
        numNode--;
    }

    public void removeLast() {
        Node temp = head;
        int i = 0;
        while (i < numNode - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        numNode--;

    }

    public boolean removeObj(Object object) {
        Node temp = head;
        boolean isExit = false;
        for (int i = 0; i < numNode; i++) {
            if (object.equals(temp.data)) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return isExit;

    }

    public int size() {
        Node temp = head;
        int i = 1;
        while (temp.next != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public MyLinkedList<Node> clone() {
        MyLinkedList<Node> clone = new MyLinkedList<Node>(head.data);
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
            clone.addLast(temp.data);
        }
        return clone;
    }

    public boolean contains(E element) {
        Node temp = head;


        while (temp.next!= null){
            if (element.equals(temp.data))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        int index = 0;
        Node temp = head;
        while (temp.next != null){
            if (temp.data == element){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }

    public boolean add(E element) {
        Node temp = head;

        return false;
    }

    public void ensureCapacity(int minCapacity) {
        Node temp = head;

    }
/*
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
