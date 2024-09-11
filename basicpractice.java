public class basicpractice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(55);
        Node c = new Node(22);
        a.next= b;
        b.next = c;
        // System.out.println();
        // System.out.print(a.data + " ");
        // System.out.print(a.next.data + " ");
        // System.out.print(b.next.data + " ");
        Node temp = a;
        System.out.println();
        for(int i=0;i<3;i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
