public class first{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
        public static void displayHead(Node head){
            Node temp = head;
            System.out.println();
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void displayrev(Node tail){
            Node temp = tail;
            while (temp!=null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
        public static void displayRandom(Node random){
            Node temp = random;
            while (temp.prev!=null) {
                temp = temp.prev;
            }
            //print
            while (temp!=null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static Node insertAtHead(Node head, int val){
            // Node temp = head;
            Node t = new Node(55);
            t.next = head;
            head.prev = t;
            head = t;
            return head;
        }
        public static  void inserAtTail(Node head,int w){
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node q = new Node(w);
            temp.next = q;
            q.prev = temp;
            temp = q;
        }
        public static void insertAtIdx(Node head,int idx,int val){
            Node temp = head;
            for(int i=1; i<=idx-1;i++){
                temp = temp.next;
            }
            Node r = temp.next;
            Node t  = new Node(val);
            temp.next = t;
            t.prev = temp;
            t.next = r;
            r.prev = t;
        }
        public static boolean palindrom(Node head){
            Node temp = head;
            while (temp!= null) {
                temp = temp.next;
            }
            Node t = temp;
            Node h = head;
            while (h != temp && h.prev != temp) {
                if (h.val != t.val) {
                    return false;
                }
                h = h.next;
                t=t.prev;
            }
            return true;
        }
        public static void main(String[] args) {
            first.Node a = new first.Node(3);
            first.Node b = new first.Node(4);
            first.Node c = new first.Node(38);
            first.Node d = new first.Node(73);
            first.Node e = new first.Node(39);
            first.Node f = new first.Node(30);
            a.prev=null;
            a.next=b;
            b.prev=a; 
            b.next=c;
            c.prev=b;
            c.next=d;
            d.prev=c;
            d.next=e;
            e.prev=d;
            e.next=f;
            f.prev=e;
            f.next=null;
            // displayHead(a);
            // displayrev(e);
            // displayRandom(d);
            // Node newHead = insertAtHead(a,55);
            // displayHead(newHead);
            inserAtTail(a, 1000);
            displayHead(a);
            insertAtIdx(a, 4, 0445);
            displayHead(a);
            System.out.println("Is palindrome: " + palindrom(a));
            } 
        }  
    
