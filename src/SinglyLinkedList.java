public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void insert(int nodeVal){
        Node node = new Node();
        node.data = nodeVal;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
//                System.out.println(n.data);
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int nodeVal){
        Node node = new Node();
        node.data = nodeVal;
        node.next = head;
        head = node;
    }
    public void insertAt(int position, int nodeVal){
        if(position == 0){
            insertAtStart(nodeVal);
        }else {
            Node node = new Node();
            node.data = nodeVal;
            node.next = null;

            Node n = head;
            for (int i = 0; i < position - 1; i++) {

                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){

        if(index == 0){
            head = head.next;
        }else{
            Node n = head;
            for(int i=0; i<index - 1; i++){
                n = n.next;
            }
            n.next = n.next.next;
        }
    }
    public void printLL(){
        Node n1 = head;
        while(n1 != null){
            System.out.println(n1.data);
            n1 = n1.next;
        }

    }

}
