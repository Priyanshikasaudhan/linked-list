public class printlist {
    //Recursion
    public static void displayr(Node head){
        if(head == null) return ;
            System.out.print(head.data + " ");
            displayr(head.next);
        
    }
    //Print Reverse
    public static void displayrevrse(Node head){
        if(head == null) return ;
        displayrevrse(head.next);
            System.out.print(head.data + " ");
    }
    //Normal Function
    public static void display(Node head) {
        System.out.println();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(10);
        Node c = new Node(11);
        Node d = new Node(14);
        Node e = new Node(77);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println();
        displayrevrse(a);
    }
}
