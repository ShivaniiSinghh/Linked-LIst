package DoublyLL;

public class Deletion {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insert_from_front(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    //DELETION OF NODE FROM BEGINNING
    public void delete_from_beginnning(){
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        else{
            temp = temp.next;
            head = temp;
            head.prev = null;
        }
    }
    //DELETION OF NODE FROM END WITHOUT USING TAIL
//    public void delete_from_end(){
//        Node temp = head;
//        Node ptr = temp.next;
//        if(head == null){
//            System.out.println("List is empty");
//        }
//        while(ptr.next!=null){
//            temp=ptr;
//            ptr=ptr.next;
//        }
//        temp.next = null;
//    }
    //DELETION OF NODE FROM END USING TAIL
    public void delete_from_end(){
        Node temp = tail;
        if(head == null){
            System.out.println("List is empty");
        }
        temp = temp.prev;
        temp.next = null;
        tail=temp;
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    //DELETION OF NODE FROM SPECIFIC POSITION
    public void delete_from_specific_position(int p){
        Node temp = head;
        Node ptr = temp.next;
        if(head == null){
            System.out.println("List is empty");
        }
        if(p==1){
            head = temp.next;
        }
        for(int i =1; i<p-1; i++){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = ptr.next;
    }
    public static void main(String[] args) {
        Deletion dd = new Deletion();
        dd.insert_from_front(1);
        dd.insert_from_front(2);
        dd.insert_from_front(3);
        dd.insert_from_front(4);
//        dd.delete_from_beginning();
//        dd.delete_from_end();
        dd.delete_from_specific_position(1);
        dd.traverse();
    }
}
