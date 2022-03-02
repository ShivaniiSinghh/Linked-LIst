package SinglyLL;

import java.util.Scanner;

public class Creation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    //CREATION OF LINKED LIST
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Enter 1 to enter next data : ");
            n = sc.nextInt();
        }
        while (n == 1);
    }

    // TRAVERSAL OF THE DATA PRESENT IN THE LIST
    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist");
        }
        else {
            do {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            while(temp!=head);
        }
    }
    public static void main(String[] args) {
        Creation ll = new Creation();
        ll.creation();
        ll.traverse();
    }
}