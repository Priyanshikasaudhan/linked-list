public class allInOne {
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
        int size = 0;
        //insert at end
        void insert(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
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
            size++;
        }
        //insert at any index
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size){
                insert(val);
                return;
            }
            else if(idx == 0){
                insertBeg(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        //print given index value
        int getAt(int idx){
            if (idx<0 || idx>size) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if (idx==0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;// is line ka matlab jab last node delte kroge to tail tumhra temp ba jyega nh to jo delte ho jyega whi tail rhega. 
            size--;
        }
        void display(){
            Node temp = head;
            
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // int size(){ O(n)
        //     Node temp = head;
        //     int count = 0;
        //     while ( temp != null) {
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
         
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
            ll.insertAt(2,99);
            ll.display();
            // System.out.println(ll.size());
            ll.insertAt(0,100);
            ll.display();
            System.out.println(ll.tail.data);
            System.out.println(ll.getAt(-6));
            System.out.println(ll.size);
            ll.deleteAt(0);
            ll.display();
        }
         
}
