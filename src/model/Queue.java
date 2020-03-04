package model;

public class Queue {
    public class Node {
        private Node next;
        private int data;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove here
    private Node tail; // add here

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return this.head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return data;
    }

}
