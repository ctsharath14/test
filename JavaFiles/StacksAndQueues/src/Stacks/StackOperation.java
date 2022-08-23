package Stacks;

public class StackOperation {
    static Node head;
    public static int count = 1;


      /*Method to pop new element is stack:
      data - data to be added is used as parameter
      return - if list is empty it head = newNode and return.*/
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


     /*Method: popping the top element from the stack
     return - new head which is next to the previous head*/
    public Node pop() {
        System.out.println("Popped element is : " + head.data);
        head = head.next;
        return head;
    }


    // Method to print top element of the stack
    public void peak() {
        if (head != null) {
            System.out.println("Top of the stack is " + head.data);
        } else {
            System.out.println("No element left in the stack.");
            return;
        }
    }


      /*Method to Print list Here first we check if stack is empty and give a message
      to user, if not we print every current Node starting from head, while
      changing to currentNode to next every time it prints one node.*/
    public void printList() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }

    }
}
