package com.stack;

import java.util.Scanner;


    class Linklist1 {


        static class Node {
            int data;
            Node nextNode;


        }

        public Linklist1() {
            this.Top = null;

        }

        Node Top;


        public void Push(int a) {
            Node temp = new Node();
            if (temp == null) {
                System.out.println("Overflow");
                return;
            }
            temp.data = a;
            temp.nextNode = Top;
            Top = temp;
        }

        public void Pop() {
            if (Top == null) {
            System.out.println("Underflow");
            return;

        }
              Top=(Top).nextNode;
    }
        public void display() {
            if (Top == null) {
                System.out.println(" ");
            } else {
               Node temp = Top;
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.nextNode;
                }
            }
        }
    }





    public class Stack1 {
        public static void main(String[] args) {
          Linklist1 l = new Linklist1();
          l.Push(20);
          l.Push(30);
          l.Push(40);
          l.display();
            System.out.println("This is stack");
          l.Pop();
          l.display();
        }


                }






