public class CircularSinglyLinkedList {
    Node head;

    public void insert(int nodeVal){

        if (head == null){
            insertAtStart(nodeVal);
        }else{
            Node node = new Node();
            node.data = nodeVal;

            Node temp = head;
            Node n = head;
            while(n.next != temp){
                n = n.next;
            }
            n.next = node;
            node.next = head;
        }
    }
    public void insertAt(int index, int nodeVal){
        Node node = new Node();
        node.data = nodeVal;

        if(head == null){
            insertAtStart(nodeVal);
        }else{
            if(index == 0){
                insertAtStart(nodeVal);
            }else{
                Node n = head;
                for(int i=0; i<index-1; i++){
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            }
        }
    }
    public void insertAtStart(int nodeVal){
        Node node = new Node();
        node.data = nodeVal;
        if(head == null){
            node.next = node;
            head = node;
        }else{
            Node temp = head;
            Node n = head;
            while(n.next != temp){
                n = n.next;
            }
            n.next = node;
            node.next = head;
            head = node;
        }
    }
    public void show(){
        Node temp = head;
        Node n = head;
        while(n.next != temp){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
