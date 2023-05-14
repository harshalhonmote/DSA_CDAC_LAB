package DSALAB.src.SinglyLL;


class Test{
    public static void main(String[] args) {
        SinglyList sl = new SinglyList();
        sl.addFirst(12);
        sl.addFirst(22); 
        sl.addLast(200);
        sl.addLast(300);
        sl.addLast(400);
        sl.addLast(70);
        //sl.addLast(800);
        //sl.deleteFirst();
        //sl.Display();
        // System.out.println("reversell :");
        // sl.reverseLL();
        
        sl.Display();
        sl.reverseLLRev();

        //sl.middle();
        // sl.deleteLast();
       // sl.sort();
        //sl.Display();
    }
}