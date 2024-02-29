package DataStructures;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

  
    public Queue(int maxSize) {
        queue = new int[maxSize];
        capacity = maxSize;
        front = 0;
        rear = -1;
        count = 0;
    }

    // add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        count++;
    }

    // remove the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }

    // get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        return queue[front];
    }

    // get the lenght of the queue
    public int getLength() {
        return count;
    }
}


