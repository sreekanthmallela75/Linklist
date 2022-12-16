package com.stack;

import java.util.Scanner;

public class Stack2 {

    static class node {
        int data;
        Node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }

        Node top = null;

        public void push(Scanner sc) {
            System.out.println("Enter Data");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            if (top==null){
                top=newnode;
            }
            else {
                newnode.next=top;
                top=newnode;
            }
        }
        public void pop(){
            if (top==null){
                System.out.println("Stack is Empty");
            }
            else {
                top=top.next;
            }
        }
        public void display(){
            Node temp=top;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
            int a;
            Scanner sc = new Scanner(System.in);
            Stack s = new Stack();
            int l;
            do {
                System.out.println(" enter 1 to push  ");
                System.out.println(" enter 2 to pop ");
                System.out.println(" press 3 to display ");
                System.out.println("enter your choice ");
                a = sc.nextInt();
                switch (a) {
                    case 1: {
                        //
                        s.push(sc);
                        break;
                    }
                    case 2: {
                        s.pop();
                        break;
                    }
                    case 3: {
                        s.display();
                        break;
                    }
                }
                System.out.println("  Entere  0 to go Back to the Menu ");
                System.out.println(" enter any key to exit ");
                l = sc.nextInt();
            } while (l == 0);
            System.out.println(" exit sucessfully");
        }
    }
}
