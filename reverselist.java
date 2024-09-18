public class reverselist {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    //Concept of Reverse Linked List
    public static Node reversNode(Node head){
        if (head.next == null) {
            return head;
        }
        Node newNode = reversNode(head.next);
        head.next.next = head; // interchanging the connections
        head.next = null;
        return newNode;
    }
    // //displat revrse wiitout connectioj
    // public static void displayrever(Node head) {
    //     if (head == null) {
    //         return;
    //     }
    //     System.out.print(head.val + " ");
    //     displayrever(head.next);
    // }
    public static void display(Node head) {
            if (head == null) {
                System.out.println();
                return;
            }
            System.out.print(head.val + " ");
            display(head.next);
            
        }
           
    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(7);
        Node e = new Node(77);
        Node f = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        display(a);
        a = reversNode(a);
        display(a);
    }
}
