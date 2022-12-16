package com.stack;

public class Linklist {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.peek());
        q.dequeue( );
        q.dequeue( );
        q.dequeue( );
        q.dequeue( );

        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }

    }

}
