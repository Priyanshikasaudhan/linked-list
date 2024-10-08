public class practice {
    public static class Node{
        int data;
        Node  next;
        Node(int data){
            this.data = data;
        }
    }
    public static class  LinkedList {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }else{
               tail.next =  temp ;
            }
            tail =  temp;
        }
        void display(){
            Node temp = head;
            System.out.println();
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(44);
        ll.insertAtEnd(77);
        ll.display();
    }
}
