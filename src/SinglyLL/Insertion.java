package SinglyLL;

public class Insertion {
     Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    //TO ADD NODE IN THE BEGINNING
    public void insert_at_beginning(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            head.next = null;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    //TO ADD NODE IN THE END
    public void insert_at_end(int data){
        if(head == null) {
            Node newnode = new Node(data);
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = null;
        }
    }
    //TO ADD NODE AT A SPECIFIC POSITION
    public Node insert_at_position(int data, int pos) {
        Node newnode = new Node(data);
        if(pos<1) {
            System.out.println("Invalid Position");
            return null;
        }
        if(pos==1){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        int c=1;
        Node temp = head;
        while(c!=pos-1 && temp!=null){
            temp = temp.next;
            c++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }
    public void printAll() {
        Node p = head;
        int pos = 1;
        while (p != null) {
            System.out.println("Node at position " + pos + " is " + p.data);
            pos++;
            p = p.next;
        }
    }
    public static void main(String[] args) {
        Insertion ll = new Insertion();
        ll.head = new Node(1);
        ll.insert_at_beginning(2);
        ll.insert_at_end(3);
        ll.insert_at_position(5,2);
        ll.printAll();
    }
}
