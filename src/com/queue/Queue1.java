package com.queue;

import java.util.Scanner;

public class Queue1 {
    int f=1;
    int r=1;
    int n=10;
    int q[] = new int[n];

    public  void  enQueue(Scanner sc){

        if(r==(n-1))
        {
            System.out.println("Overflow condition");
        }
        else {
            System.out.println("Enter the data");
            int i=sc.nextInt();
           if (f==-1 && r==-1){
               f=0;
               r=0;
               q[r]=i;
           }
           else {
               r=r+1;
               q[r]=i;

           }
    }
}
public void deQueue(){
        if(f==-1 && r==-1){
            System.out.println("Underflow condition");
        }
        else {
            f=f+1;
        }
    }
    public void display(){
        System.out.println("items are:");

        for (int i=0; i<=r; i++){
            System.out.println(q[i]);
        }
    }

        public static void main(String[] args) {
            int a;
            Scanner sc = new Scanner(System.in);
            Queue1 q1 = new Queue1();
            int i;
            do {
                System.out.println("Enter 1 to enQueue");
                System.out.println("Enter 2 to deQueue");
                System.out.println("press 3 to display");
                System.out.println("Enter your choice");
                a = sc.nextInt();
                switch (a) {
                    case 1: {
                        q1.enQueue(sc);
                        break;
                    }
                    case 2: {
                        q1.deQueue();
                        break;
                    }
                    case 3: {
                        q1.display();
                        break;
                    }
                }
                System.out.println("Enter 0 to go back to the menu");
                i = sc.nextInt();
            }
            while (i==0);
            System.out.println("Exit Successfully");
        }
    }
