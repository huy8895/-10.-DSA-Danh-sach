package LinkedListtheothuvien;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.addFirst(2.1);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.addFirst(3);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.addFirst(10);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.add(4, 12);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.removeLast();
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.remove(3);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.removeObj(10);
        System.out.println("myLinkedList = " + myLinkedList);
    }
}
