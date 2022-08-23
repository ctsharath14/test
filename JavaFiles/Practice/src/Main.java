import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Operation op = new Operation();
        Operation op1 = new Operation();
        Operation op2 = new Operation();
        Operation op3 = new Operation();
        Operation op4 = new Operation();
        Operation op5 = new Operation();

        //Create a simple linked list
        System.out.println("UC1 - Simple linked list");
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("LinkedList : "+list);

        //Add node in the beginning
        System.out.println();
        System.out.println("UC2 - Add node in the beginning");
        op.addNode(70);
        op.addNode(30);
        op.addNode(56);
        op.display();

        //Add node in the last
        System.out.println();
        System.out.println("UC3 - Add node in the last");
        op1.append(56);
        op1.append(30);
        op1.append(70);
        op1.display();
        op1.searchNode(30);
        //op1.display();

        //Insert between nodes
        System.out.println();
        System.out.println("UC4 - Insert between nodes");
        op2.append(56);
        op2.append(70);
        op2.insertBetweenNode(56, 70, 30);
        op2.display();

        //Delete from start
        System.out.println();
        System.out.println("UC5 - Deleting first node");
        op3.append(56);
        op3.append(30);
        op3.append(70);
        System.out.println("List before deleting");
        op3.display();
        op3.pop();
        System.out.println("List after deleting");
        op3.display();

        //Delete from end
        System.out.println();
        System.out.println("UC6 - Deleting last node");
        op4.append(56);
        op4.append(30);
        op4.append(70);
        System.out.println("List before deleting");
        op4.display();
        op4.popLast();
        System.out.println("List after deleting");
        op4.display();






    }
}
