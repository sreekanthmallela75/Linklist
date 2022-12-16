package com.stack;

import java.util.Scanner;

public class Stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];


    public void push(Scanner sc) {

        System.out.println("enter the data");
        int data = sc.nextInt();

        if (top == (n-1)) {
            System.out.println("overflow");

        } else {
            System.out.println("Enter data");
            int i = sc.nextInt();
            top = top+1;
            a[top]=i;
            System.out.println("Item inserted");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top-1;
            System.out.println("Item Deleted");
        }
    }


    public void display() {

            System.out.println("Items are");
           for (int j=top; j>=0; j--){

            System.out.println(a[j]);
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
