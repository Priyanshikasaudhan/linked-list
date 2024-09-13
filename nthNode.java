public class nthNode {
    public static Node nth(Node head,int n){
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n +1;
        temp = head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(44);
        Node d = new Node(5);
        Node e = new Node(100);
        Node f = new Node(88);
        Node g = new Node(78);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        f.next =g;
        Node q = nth(a, 4);
        System.out.println();
        System.out.println(q.data);
    }
}
