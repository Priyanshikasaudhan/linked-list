public class nthonetervers {
    public static Node nthNode(Node head,int n){
         Node slow = head;
         Node fast = head;
         for(int i=1;i<=n;i++){
            fast = fast.next;
         }
         while (fast != null) {
            slow = slow.next;
            fast = fast.next;
         }
         return slow;
    }
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data =  data;
        }
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
        Node q = nthNode(a, 4);
        System.out.println();
        System.out.println(q.data);
    }
}
