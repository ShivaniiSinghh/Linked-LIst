package Questions;

public class MaxElement {
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
    public void elements(){
        Node temp = head;
        int max=0;
        while(temp!=null){
            if(temp.data>max){
                max=temp.data;
            }
            temp = temp.next;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        MaxElement me = new MaxElement();
        me.creation(5);
        me.creation(2);
        me.creation(3);
        me.creation(4);
        me.elements();
    }
}
