public class Operation {
    Node node;
    Node head;
    Node tail;
    int size;


    public void addNode(int data){
        node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            Node temp = head;
            head = node;
            node.next = temp;
        }
    }


    public void append(int data){
        node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = tail.next;
        }
    }


    public void insertBetweenNode(int a, int b, int c){
        node = new Node(c);
        Node temp = head;
        while(temp.data==a && temp.next.data==b){
            Node newNode = temp.next;
            temp.next = node;
            node.next = newNode;
        }
    }


    public void pop(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            head = temp.next;
        }
    }


    public void popLast(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void searchNode(int data){
        Node temp = head;
        int count = 0;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(temp != null){
                count++;
                if(temp.data == data){
                    System.out.println("Data was found in position "+count);
                    break;
                }
                else{
                    temp = temp.next;
                }
            }
        }
    }




    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        System.out.println("Null");
    }

}
