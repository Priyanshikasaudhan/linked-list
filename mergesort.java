public class mergesort {
    public class Node{
        int  val;
        Node next;
        Node(int  val){
            this.val = val;
        }
    }
    public static Node megreSortList(Node List1,Node List2){
        Node t1 = List1;
        Node t2= List2;
        // Node h = new Node(0);
        Node t = h;
        while (t1!=null && t2!=null) {
            if (t1.val<t2.val) {
                t.next=t1;
                t=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if (t1==null) {
            t=t2.next;
        }else{
            t=t1.next;
        }
        return h.next;
    }
    public static void main(String[] args) {
        
    }
}
