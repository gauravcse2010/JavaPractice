public class DoublyLinkedList {
    DoubleNode head;
// Add tail logic if we want to traverse in reverse order
    public void insert(int nodeVal){
        DoubleNode node = new DoubleNode();
        node.data = nodeVal;
        node.next = null;
        if(head == null){
            head = node;
            node.prev = null;
        }else{
            DoubleNode n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int nodeVal){
        DoubleNode node = new DoubleNode();
        node.data = nodeVal;
        node.next = head;
        node.prev = null;
        head = node;
    }
    public void insertAt(int position, int nodeVal){
        if(position == 0){
            insertAtStart(nodeVal);
        }else {
            DoubleNode node = new DoubleNode();
            node.data = nodeVal;
            DoubleNode n = head;
            for (int i = 0; i < position - 1; i++) {
                n = n.next;
            }
            node.prev = n;
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            DoubleNode n = head;
            for(int i=0; i<index - 1; i++){
                n = n.next;
            }
            n.next = n.next.next;
            n.next.prev = n;
        }
    }
    public void printLL(){
        DoubleNode n1 = head;
        while(n1 != null){
            System.out.println(n1.data);
            n1 = n1.next;
        }
    }
}
