package DoublyLL;

public class  Insertion {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    //INSERTION AT THE BEGINNING
    public void insert_at_beginning(int data) {
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    //INSERTION AT THE END
    public void insert_at_end(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    //INSERTION AT SPECIFIC POSITION
    public void insert_at_specific_position(int data,int pos){
        Node newnode = new Node(data);
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 1; i < pos - 1; i++) {
            temp = ptr;
            ptr = ptr.next;
        }
        newnode.prev = temp;
        newnode.next = ptr;
        temp.next = newnode;
        ptr.prev = newnode;
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.print("List is empty");
        }
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        Insertion dl = new Insertion();
        dl.insert_at_beginning(1);
        dl.insert_at_beginning(2);
        dl.insert_at_beginning(3);
        dl.insert_at_beginning(4);
        dl.insert_at_end(5);
        dl.insert_at_specific_position(6,1);
        dl.traverse();

    }
}