
public class Main {
    public static void main(String[] args) {
        //Singly Linked List
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(8);
        sll.insert(9);
        sll.insert(6);
        sll.insert(4);
        sll.printLL();
        sll.insertAtStart(7);
        System.out.println("\n");
        sll.printLL();
        sll.insertAt(3,5);
        System.out.println("\n");
        sll.printLL();
        sll.insertAt(0,25);
        System.out.println("\n");
        sll.printLL();
        sll.deleteAt(2);
        System.out.println("\n");
        sll.printLL();
        sll.deleteAt(0);
        System.out.println("\n");
        sll.printLL();

        //Circular Singly Linked list
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.insert(1);
        csll.insert(2);
        csll.insert(5);
        csll.insert(3);
        csll.show();
        System.out.println("\n");
        csll.insertAtStart(10);
        csll.insertAtStart(11);
        csll.show();
        csll.insertAt(4,15);
        System.out.println("\n");
        csll.show();
    }

}
