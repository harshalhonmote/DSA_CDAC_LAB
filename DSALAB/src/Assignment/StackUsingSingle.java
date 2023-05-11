package DSALAB.src.Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingle {
    Queue<Integer> q = new LinkedList<>();
   
    public void push(int data){
        int previousSize = q.size();
        q.offer(data);
        while(0<previousSize){
            q.offer(q.poll());
            previousSize--;
        }
    }
    public void pop(){
        System.out.println("pop:"+q.remove());
    }
    public int peek(){
        return q.peek();
    }
    public static void main(String[] args) {
        StackUsingSingle s = new StackUsingSingle();
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
