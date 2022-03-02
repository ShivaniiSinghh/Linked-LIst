package DoublyLL;

import java.util.Scanner;

public class Creation {
    static class Node{
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

    public void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Data : ");
            data = sc.nextInt();
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                tail = newnode;
            }
            else{
                head.prev = newnode;
                newnode.next = head;
                head = newnode;
            }
            System.out.print("Enter 1 to enter next data : ");
            n=sc.nextInt();
        }
        while(n==1);
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Creation dll = new Creation();
        dll.creation();
        dll.traverse();
    }
}
