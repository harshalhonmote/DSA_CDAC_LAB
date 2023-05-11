package DSALAB.src.Queue;

public class DequeUsingLL {
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
    private Node tail;

    public DequeUsingLL() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void pushFront(int data) {
        if (isEmpty())
            addHead(data);
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
    }

    public void popFront() {
        if (isEmpty())
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev=null;
            }
        }
    }

    public int peekFront() {
        if (isEmpty())
            return 0;
        return head.data;
    }

    public void pushBack(int data) {
        if (isEmpty())
            addHead(data);
        else {
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void popBack() {
        if (isEmpty())
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next=null;
            }
        }
    }

    public int peekBack() {
        if (isEmpty())
            return 0;
        return tail.data;
    }

    public void displayForward(Node temp) {
        if (temp == null)
            return;
        System.out.print(temp.data + "->");
        displayForward(temp.next);
    }

    public void displayBackward(Node temp) {
        if (temp == null)
            return;
        System.out.print(temp.data + "->");
        displayBackward(temp.prev);
    }

}
