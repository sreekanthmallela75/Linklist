package com.queue;

import com.stack.Linklist;

import java.util.Scanner;

  class Linklist2{


     static class Node {
         int data;
         Node nextNode;

          Node(int data) {
             this.data = data;
             this.nextNode = null;
         }
     }
         Node f = null;
         Node r = null;

         public void enQueue() {
             Scanner sc = new Scanner(System.in);

             System.out.println("Enter data");
             int data = sc.nextInt();
             Node newNode = new Node(data);
             if (f == null) {
                 f = newNode;
                 r = newNode;
             } else {
                 r.nextNode = newNode;
                 r = newNode;
             }
         }

         public void deQueue() {
             if (f == null) {
                 System.out.println("Underflow condition");
             } else {
                 f = f.nextNode;
             }
         }

         public void display() {
             Node temp = f;
             while (temp != null) {
                 System.out.println(temp.data+" ");
                 temp = temp.nextNode;
             }
         }
     }
        public class Queue {
        public static void main(String[] args) {
            int a;
            Scanner sc = new Scanner(System.in);
            Linklist2 q = new Linklist2();
            int i;
            do {
                System.out.println("Enter 1 to enQueue");
                System.out.println("Enter 2 to deQueue");
                System.out.println("press 3 to display");
                System.out.println("Enter your choice");
                a = sc.nextInt();
                switch (a) {
                    case 1: {
                       q.enQueue();
                    }
                    case 2: {
                        q.deQueue();
                        break;
                    }
                    case 3: {
                        q.display();
                        break;
                    }
                } System.out.println("Enter 0 to go back to the menu");
                i = sc.nextInt();
            } while (i == 0); System.out.println("Exit Successfully");
        }
    }






