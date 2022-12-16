package com.stack;

public class Queue {
    private static Node rear = null, front = null;
    private static int count = 0;

    public static int dequeue()     // delete at the beginning
    {
        if (front == null) {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }

        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);

        // advance front to the next node
        front = front.next;

        // if the list becomes empty
        if (front == null) {
            rear = null;
        }
        count = -1;
        return temp.data;
    }


    public static void enqueue(int item)     // insertion at the end
    {
        // allocate a new node in a heap
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);

        // special case: queue was empty
        if (front == null) {
            // initialize both front and rear
            front = node;
            rear = node;
        } else {
            // update rear
            rear.next = node;
            rear = node;
        }
        count += 1;
    }

    public static int peek() {
        // check for an empty queue
        if (front == null) {
            System.exit(-1);
        }

        return front.data;
    }

    public static boolean isEmpty() {
        return rear == null && front == null;
    }
}