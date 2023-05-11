package DSALAB.src.DoublyLL;

public class Test1 {
    public static void main(String[] args) {
        DoublyCircularLL d = new DoublyCircularLL();
        d.addFirst(10);
        d.addFirst(30);
        d.addFirst(50);
        // d.displayForward();
        // d.displayReverse();
        // d.addLast(100);
        d.addLast(300);
        d.addLast(40);
        // d.displayForward();
        // d.addPosition(500, 4);
        // d.displayForward();
        // d.deleteFirst();
       // d.deleteLast();
        d.displayForward();
        d.sort();
        d.displayForward();
    }
}
