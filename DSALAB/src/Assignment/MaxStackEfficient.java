package DSALAB.src.Assignment;

import java.util.Stack;

public class MaxStackEfficient {
    static Stack<Integer> stack = new Stack<>();
    static int max;

    static int peek(){
        return stack.peek();
    }
    static void pop(){
        int temp = peek();
        stack.pop();
        if(temp > max){
            max = (max*2-temp);
        }
        System.out.println("element Poped");
    }
    static void push(int data){
        if(stack.size()==1){
            stack.push(data);
            max = data;
            return;
        }
        if(data > max){
            stack.push(2*data-max);
            max = data;
        }
        else{
            stack.push(data);
        }
       
    }
    static void getMax(){
        System.out.println("max: "+max);
    }
    public static void main(String[] args) {
        push(20);
        push(40);
        push(30);
        push(90);
        push(50);
        getMax();
        pop();
        getMax();
        pop();
        getMax();
    }
}
