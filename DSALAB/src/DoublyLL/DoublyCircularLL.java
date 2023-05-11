package DSALAB.src.DoublyLL;

public class DoublyCircularLL {
    static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node() {
            data = 0;
            prev = next = null;
        }

        public Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    private Node head;

    public DoublyCircularLL() {
        head = null;
    }

    public void displayForward() {
        if (isEmpty())
            return;
        Node temp = head;
        // do{
        // System.out.print(temp.data+"->");
        // temp = temp.next;
        // }while(temp != head);
        //
        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data + "->HEAD");
        System.out.println();
    }

    public void displayReverse() {
        if (isEmpty())
            return;
        Node temp = head.prev;
        do {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.print("->HEAD");
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    // if List is Empty
    public void addHead(int data) {
        Node newNode = new Node(data);
        head = newNode;
        head.next = head;
        head.prev = head;
    }

    public void addFirst(int data) {
        if (isEmpty())
            addHead(data);
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;

        }
    }

    public void addLast(int data) {
        if (isEmpty())
            addHead(data);
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    public void addPosition(int data, int pos) {
        if (pos <= 0 || isEmpty())
            return;
        if (pos == 1)
            addFirst(data);
        else {
            int i = 1;
            Node temp = head;
            while (i < pos && temp.next != head) {
                i++;
                temp = temp.next;
            }
            if (temp.next == head)
                addLast(data);
            else {
                Node newNode = new Node(data);
                newNode.next = temp;
                newNode.prev = temp.prev;
                temp.prev.next = newNode;
                temp.prev = newNode;
            }
        }
    }

    public void deleteFirst() {
        if (isEmpty())
            return;
        if (head.next == head)
            head = null;
        else {
            head.next.prev = head.prev;
            head.prev.next = head.next;
            head = head.next;
        }
    }

    public void deleteLast() {
        if (isEmpty())
            return;
        if (head.next == head)
            head = null;
        else {
            head.prev.prev.next = head;
            head.prev = head.prev.prev;
        }
    }

    public void sort() {
        Node i = head.next;
        do{
            Node j= i.prev;
            int key = i.data;
            while(j != head.prev && j.data > key){
                j.next.data = j.data;
                j=j.prev;
            }
            j.next.data=key;
            i=i.next;
        }while(i != head);
    } 
}
