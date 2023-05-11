package DSALAB.src.Assignment;

import java.util.Scanner;

public class StackUsingLinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int peek() {
        if (top == null)
            return -1;
        return top.data;
    }

    public void dispaly() {
        if (top == null)
            return;
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void pop() {
        if (top == null)
            return;
        System.out.println("Poped ele: " + top.data);
        top = top.next;
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        int choice = 1;
        while (choice != 0) {
            System.out.println("0.EXIT");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEk");
            System.out.print("Enter Choice: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter no:");
                    s.push(new Scanner(System.in).nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    System.out.println("PEEK: " + s.peek());
                    break;
                case 4:
                    s.dispaly();
                    break;
                default:
                    break;
            }
        }
    }
}
