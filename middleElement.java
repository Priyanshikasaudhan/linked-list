public class middleElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // public static Node middNode(Node head){
    //     Node slow = head;
    //     Node fast = head;
    //     while (fast != null && fast.next.next!=null) {
    //         slow = slow.next;
    //         fast=fast.next.next;
    //     }
    //     return slow;
    // }
    //delete middle
    public static Node deleNode(Node head){
        Node slow = head;
        Node fast = head;
        if (head.next == null) {
            head = null;
            return head;
        }
        // while (fast.next.next!=null && fast.next.next.next.next !=null) //delete left side in even order
        while (fast.next.next!=null && fast.next.next.next.next !=null) { //delete right side in even order 
            slow =slow.next;
            fast=fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(7);
        Node c = new Node(77);
        Node d = new Node(88);
        Node e = new Node(48);
        Node f = new Node(58);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // Node q = middNode(a);
        // System.out.println();
        // System.out.println("Find Middle Node: "+ q.data);
        Node q = deleNode(a);
        System.out.println();
        // System.out.println(q.data+" ");
        display(a);
    }
}
