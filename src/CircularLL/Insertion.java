package CircularLL;

public class Insertion {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    Node head = null;
    Node tail = null;

    //INSERTING AT THE BEGINNING
    public void insert_at_start(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                tail = newnode;
                newnode.next = head;
            }
            else{
                newnode.next= head;
                head=newnode;
                tail.next = head;
            }
    }
    //INSERTING AT THE END
    public void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            newnode.next = head;
        } else {
            tail.next = newnode;
            tail = newnode;
            newnode.next = head;
        }
    }
    //INSERTING AT SPECIFIC POSITION
    public void insert_at_specific_position(int data, int pos) {
        Node temp = head;
        Node newnode = new Node(data);
        if(pos==1){
            head=temp.next;
        }
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Insertion cli = new Insertion();
        cli.insert_at_start(1);
        cli.insert_at_start(3);
        cli.insert_at_end(8);
        cli.insert_at_specific_position(2,2);
        cli.traverse();
    }
}
