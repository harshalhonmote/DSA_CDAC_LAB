package DSALAB.src.Queue;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DequeUsingLL d = new DequeUsingLL();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println();
            System.out.println("0.EXIT");
            System.out.println("1.pushFront");
            System.out.println("2.popFront");
            System.out.println("3.pushBack");
            System.out.println("4.popBack");
            System.out.println("5.displayForward");
            System.out.println("6.displayBackward");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter no:");
                    d.pushFront(sc.nextInt());
                    break;
                case 2:
                    d.popFront();
                    break;
                case 3:
                    System.out.print("Enter no:");
                    d.pushBack(sc.nextInt());
                    break;
                case 4:
                    d.popBack();
                    break;
                case 5:
                    d.displayForward(d.getHead());
                    break;
                case 6:
                    d.displayBackward(d.getTail());
                    break;
                default:
                    break;
            }
        }
    }
}
