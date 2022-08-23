package Queues;

/*Ability to dequeue from the beginning
        -Use LinkedList to do the Queue Operations*/
public class Dequeue {
    Node front;
    Node rear;


    class Node {
        int key;
        Node next;

        public Node(int key) {

            this.key = key;
            this.next = null;
        }
    }

    // add data into the Queue
    public void enQueue(int data) {
        if (front == null) {
            rear = new Node(data);
            front = rear;
        } else {
            rear.next = new Node(data);
            rear = rear.next;
        }
    }

    // Delete Data From Queue
    public void deQueue() {
        if (front != null) {
            int temp = front.key;
            front = front.next;
            return;
        }

    }

    // Print method
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.key + "-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Queue Problem....!!!");
        Dequeue queue = new Dequeue();

        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.display();
        System.out.println();
        System.out.println("After deleting element from the queue");
        queue.deQueue();
        queue.display();

    }
}
