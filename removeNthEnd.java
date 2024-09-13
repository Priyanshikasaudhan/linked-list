public class removeNthEnd {
    public static Node daleteNthEndRemove(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next =  slow.next.next;
        return head;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =  data;
        }
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
        Node a = new Node(5);
        Node b = new Node(55);
        Node c = new Node(57);
        Node d = new Node(51);
        Node e = new Node(45);
        Node f = new Node(56);
        Node g = new Node(588);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println();
        display(a);
        // System.out.println();
        a = daleteNthEndRemove(a, 7);
        display(a);
        a =  daleteNthEndRemove(a, 4);
        display(a);
    }
}
