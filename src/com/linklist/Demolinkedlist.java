package com.linklist;

public class Demolinkedlist {
    class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }
    //
    public Node head = null;
    public Node tail = null;


    public void addNode(int data){


        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
            tail = newNode;
        }else {
            tail.nextNode=newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node present = head;

        if (head==null){
            System.out.println("List is Empty");
        }
        else
        {
            System.out.println("Nodes is Singly Linked list ");
            while (present!=null){
                System.out.println(present.data+" ");
                present = present.nextNode;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Demolinkedlist d1 = new Demolinkedlist();
        d1.addNode(1);
        d1.addNode(5);
        d1.addNode(10);
        d1.display();
    }


}




