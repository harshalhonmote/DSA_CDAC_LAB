package DSALAB.src.Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> main = new LinkedList<>();
    Queue<Integer>temp = new LinkedList<>();
    public void push(int data){
        if(main.isEmpty() && temp.isEmpty()){
            main.offer(data);
            temp.offer(data);
        }
        else{
            while(!main.isEmpty()){
                temp.offer(main.poll());
            }
            main.offer(data);
            while(!temp.isEmpty()){
                main.offer(temp.poll());
            }
        }
    }
    public void pop(){
        System.out.println("POP:"+ main.poll());
    }
    public int peek(){
        return main.peek();
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

    }
}
