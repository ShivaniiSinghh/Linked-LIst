package CircularLL;

public class Deletion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insert_at_start(int data){
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
    //TO DELETE A NODE FROM BEGINNING
    public void delete_from_beginning(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            temp=temp.next;
            head= temp;
            tail.next = head;
        }
    }
    //TO DELETE A NODE FROM END
    public void delete_from_end(){
        Node temp = head;
        Node ptr = temp.next;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(ptr.next!=head){
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = head;
            tail=temp;
        }
    }
    public void delete_from_specific_position(int p){
        Node temp = head;
        Node ptr = temp.next;
        if(head == null){
            System.out.println("List is empty");
        }
        for(int i =0; i<p-1; i++){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = ptr.next;
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
        Deletion cld = new Deletion();
        cld.insert_at_start(1);
        cld.insert_at_start(2);
        cld.insert_at_start(3);
        cld.insert_at_start(4);
//        cld.delete_from_beginning();
//        cld.delete_from_end();
        cld.delete_from_specific_position(1);
        cld.traverse();
    }
}
