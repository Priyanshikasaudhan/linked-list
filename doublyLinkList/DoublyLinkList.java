public class DoublyLinkList {
    public class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    
        public static Node insertAtHead(Node head, int val){
            // Node temp = head;
            Node t = new Node(40);
            t.next = head;
            head.prev = t;
            head = t;
            return head;
        }

        
    
    public static void main(String[] args) {
        Node a = 
    }
}
