package DSALAB.src.Assignment;

import java.util.Stack;

public class TrackStackMax {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> track = new Stack<>();

    static void push(int data){
        stack.push(data);
        if(stack.size()==1){
            track.push(data);
            return;
        }
        if(data > track.peek()){
            track.push(data);
        }
        else{
            track.push(track.peek());
        }

    }
    static void pop(){
        stack.pop();
        track.pop();
    }
    static void getMax(){
         System.out.println("Max: "+ track.peek());
    }
    public static void main(String[] args) {
        push(20);
        push(60);
        push(10);
        push(80);
        getMax();
        pop();
        getMax();
        pop();
        getMax();
    }
}
