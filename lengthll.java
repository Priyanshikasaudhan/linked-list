 public class lengthll {
    public static int lengthll(Node head){
        int count = 0;
        while ( head != null) {
            count ++; 
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(65);
        Node c = new Node(54);
        Node d = new Node(55);
        Node e = new Node(53);
        Node f = new Node(57);
        Node g = new Node(58);
        Node h = new Node(544);
        Node i = new Node(75);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        System.out.println();
        System.out.println(lengthll(a));;
       
    }
}
