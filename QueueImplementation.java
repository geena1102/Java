import java.io.*;
class Queue {
    private static final int MAX_SIZE = 5; // Maximum size of the queue
    private int[] array;
    private int front, rear, size;
    public Queue() {
        array = new int[MAX_SIZE];
        front = rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            if (isEmpty()) {
                front = 0; 
            }
            rear = (rear + 1) % MAX_SIZE;
            array[rear] = element;
            size++;
            System.out.println("Enqueued: " + element);
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int removedElement = array[front];
            if (front == rear) {
                front = rear = -1; 
            } else {
                front = (front + 1) % MAX_SIZE;
            }
            size--;
            System.out.println("Dequeued: " + removedElement);
        }
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            int i = front;
            do {
                System.out.print(array[i] + " ");
                i = (i + 1) % MAX_SIZE;
            } while (i != (rear + 1) % MAX_SIZE);
            System.out.println();
        }
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            Queue myQueue = new Queue();
            while (true) {
                System.out.println("\nQueue Operations:");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = Integer.parseInt(dis.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to enqueue: ");
                        int element = Integer.parseInt(dis.readLine());
                        myQueue.enqueue(element);
                        break;

                    case 2:
                        myQueue.dequeue();
                        break;

                    case 3:
                        myQueue.display();
                        break;

                    case 4:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
