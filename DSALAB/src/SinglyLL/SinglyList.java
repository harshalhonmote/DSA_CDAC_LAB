package DSALAB.src.SinglyLL;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class SinglyList {
    //Class Node
    static class Node{
        private int data;
        private Node next;
    
        public Node() {
            data = 0;
            next = null;
        }
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;

    public SinglyList() {
        head = null;
        tail = null;
    }
    //is Empty
    public boolean isEmpty(){
        return head==null;
    }
    //add First
    public void addFirst(int data){
       Node newNode = new Node(data);
       //If List is Empty 
       if(head == null){
        head = newNode;
        tail = newNode;
       }
        else{
           newNode.next = head;
           head = newNode;
       }
    }
    //Display Singly LL
    public void Display(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println(":"+tail.data);
    }
    //add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    //deleteFirst
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        else if(head.next == null){
            head = null;
            tail = null; 
        }
        else{
            head = head.next;
        }
    }
    //delete Last
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        } 
        else if(head.next == null){
            head = null;
            tail = null; 
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    //reverse LL
    public Node reverseLLRev(Node curr,Node prev,Node temp){
        if(curr == null){
            //temp = prev;
            return prev;
        }
        Node tempp =reverseLLRev(curr.next,curr,temp);
        curr.next=prev;
      
        return tempp;
    }
    public void reverseLLRev(){
        Node temp =reverseLLRev(head,null,null);
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public void reverseLL(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        } 
        Node curr = head;
        Node next=null,prev=null;
        while(curr != null){
             next = curr.next;
             curr.next = prev;
             prev=curr;
             curr=next;
        }
        head = prev;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
   //middle of ll
   public void middle(){
    if(isEmpty()){
        System.out.println("List is Empty");
        return;
    } 
    else{
        Node fast=head,slow=head;
        //fast==null->for Even No. of node
        //fast.next==null->for Odd No. of node
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element: "+ slow.data);
    }
   }
   //?? Sort LL
   public void sort(){
    Node i= head;
    while(i != null){
        Node j=i.next;
        while(j != null){
            if(i.data > j.data){
                int temp = i.data;
                i.data = j.data;
                j.data =temp;
            }
            j=j.next;
        }
        i=i.next;
    }
   }

}
