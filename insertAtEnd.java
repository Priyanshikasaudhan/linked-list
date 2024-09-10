public class insertAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // Struture of LinkedList
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insert(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        //insert at beg
        void insertBeg(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            }else {
                temp.next = head;
                head  = temp;
            }
        }
        //insert at any index
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insert(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void display(){
            Node temp = head;
            
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while ( temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
         
    }
        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertBeg(88);
            ll.display();
            ll.insert(5);
            ll.display();
            ll.insert(56);
            ll.display();
            ll.insert(4);
            ll.display();
            ll.insertBeg(55);
            ll.display();
            ll.insertAt(3,99);
            ll.display();
            System.out.println(ll.size());
        }
         
}
