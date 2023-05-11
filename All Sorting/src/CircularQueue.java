import java.util.Scanner;

class CircularQueue{
    public final int size=5;
    public int arr[];
    public int rear,front;
    
    public CircularQueue() {
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public  boolean isFull(){
      if(front == (rear+1)%size){
        return false;
    }
        return true;
    }

    public  void enqueuq(int num){
       if(front == -1)front=0;
      rear = (rear+1)%size;
       arr[rear]=num;
    }
 
    public boolean isEmpty(){
        if(rear == -1 || rear == front){
            rear=-1;
            front=-1;
            return true;
        }
        return false;
    }
    public void dequeue(){
        System.out.println("Element Removed..");
        front = (front+1)%size;
    }

    public int peek(){
        return arr[(front+1)%size];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue a = new CircularQueue();
        int choice=1;
        while(choice != 0){
            System.out.println("0.EXIT");
            System.out.println("1.enqueuq");
            System.out.println("2.dequeue");
            System.out.println("3.Peek");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a Number: ");
                    int n = sc.nextInt();
                    if(a.isFull()){
                        a.enqueuq(n);
                    }
                    else{
                        System.out.println("Queue is Full");
                    }
                    break;
                case 2:
                    if(a.isEmpty()){
                        System.out.println("Queue is Empty...");
                    }
                    else {
                        a.dequeue();
                    }
                    break;
                case 3:
                if(a.isEmpty()){
                    System.out.println("Queue is Empty...");
                }
                else {
                    System.out.println(a.peek());
                }
                    break;
            
                default:
                System.out.println("Enter Valid Choice!!!");
                    break;
            }
        }
    }
}