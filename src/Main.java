
public class Main {
    public static void main(String[] args) {
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
    }

}
