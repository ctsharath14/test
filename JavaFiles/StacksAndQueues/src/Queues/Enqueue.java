package Queues;

/*Ability to create a Queue of 56->30->70
    - Use LinkedList to do the Queue Operations
    - Here enqueue will internally call append method on LinkedList.
    - So 56 will be added first then 30 and then 70 to make 56 on top of the Stack*/
public class Enqueue {
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
        Enqueue queue = new Enqueue();

        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.display();
    }
}
