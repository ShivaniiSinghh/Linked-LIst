package Questions;

//WE HAVE TO FIND LENGTH OF THE GIVEN LINKED LIST
public class Length {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    public void creation(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void traverse(){
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        Length l = new Length();
        l.creation(1);
        l.creation(2);
        l.creation(3);
        l.creation(4);
        l.traverse();
    }
}
