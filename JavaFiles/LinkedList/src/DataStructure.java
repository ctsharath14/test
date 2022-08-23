import java.util.LinkedList;

public class DataStructure {
    public static void main(String[] args) {
        System.out.println("**************Linked List Problem*************");

        //UC1-Creating a simple Linked List of 56, 30 and 70
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("LinkedList is : " + list);

        Operations myLinkedList = new Operations();
        Operations myLinkedList1 = new Operations();
        Operations myLinkedList2 = new Operations();
        Operations myLinkedList3 = new Operations();
        Operations myLinkedList4 = new Operations();
        Operations myLinkedList5 = new Operations();
        Operations myLinkedList6 = new Operations();
        Operations myLinkedList7 = new Operations();
        Operations myLinkedList8 = new Operations();


        /*UC-2 Ability to create Linked List by adding 30 and 56 to 70
                - Node with data 70 is First Created
                - Next 30 is added to 70
                - Finally 56 is added to 30
                - LinkedList Sequence: 56->30->70*/
        System.out.println();
        System.out.println("<------------Add node in start----------->");
        myLinkedList.addNode(70);
        myLinkedList.addNode(30);
        myLinkedList.addNode(56);
        myLinkedList.PrintList();


        /*UC-3 Ability to create Linked List by appending 30 and 70 to 56
                - Node with data 56 is First Created
                - Next Append 30 to 56
                - Finally Append 70 to 30
                - LinkedList Sequence: 56->30->70*/
        System.out.println();
        System.out.println("<------------Add node in last----------->");
        myLinkedList1.append(56);
        myLinkedList1.append(30);
        myLinkedList1.append(70);
        myLinkedList1.PrintList();


        /*UC-4 Ability to insert 30 between 56 and 70
                - Final Sequence: 56->30->70*/
        System.out.println();
        System.out.println("<------------Insert between two nodes----------->");
        myLinkedList2.insert(56);
        myLinkedList2.insert(70);
        myLinkedList2.insertBetweenNode(56, 70, 30);
        myLinkedList2.PrintList();


        /*UC-5 Ability to delete the first  element in the LinkedList of sequence 56->30->70
                - Write pop method
                - Note there is new head
                - Final Sequence: 30->70*/
        System.out.println();
        System.out.println("<------------Delete first node----------->");
        myLinkedList3.insert(56);
        myLinkedList3.insert(30);
        myLinkedList3.insert(70);
        myLinkedList3.PrintList();
        System.out.println("After removing first node: ");
        myLinkedList3.pop();
        myLinkedList3.PrintList();


        /*UC-6 Ability to delete the last element in the LinkedList of sequence 56->30->70
                - Write popLast method
                - Note there is new tail
                - Final Sequence: 56->30*/
        System.out.println();
        System.out.println("<------------Delete last node----------->");
        myLinkedList4.insert(56);
        myLinkedList4.insert(30);
        myLinkedList4.insert(70);
        myLinkedList4.PrintList();
        System.out.println("After removing last node: ");
        myLinkedList4.popLastNode();
        myLinkedList4.PrintList();


        /*UC-7 Ability to search LinkedList to find Node with value 30
                - Write Junit Test Case as demonstrated in class
                - Loop through LinkedList to find node with key 30*/
        System.out.println();
        System.out.println("<------------Search node----------->");
        myLinkedList5.insert(56);
        myLinkedList5.insert(30);
        myLinkedList5.insert(70);
        myLinkedList5.PrintList();
        myLinkedList5.search(30);


        /*UC-8 Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
                - Write Junit Test Case as demonstrated in class
                - Search LinkedList to get Node with key value 30
                - Then Insert 40 to 30
                - Final Sequence: 56->30->40->70*/
        System.out.println();
        System.out.println("<------------Insert new node----------->");
        myLinkedList6.insert(56);
        myLinkedList6.insert(30);
        myLinkedList6.insert(70);
        myLinkedList6.PrintList();
        System.out.println("After inserting new node: ");
        myLinkedList6.insertAfter(30, 40);
        myLinkedList6.PrintList();


        /*UC-9 Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
                - Write Junit Test Case as demonstrated in class
                - Search LinkedList to find node with key value 40
                - Delete the node
                - Implement size() and show the Linked List size is 3
                - Final Sequence: 56->30->70*/
        System.out.println();
        System.out.println("<------------Delete node----------->");
        myLinkedList7.insert(56);
        myLinkedList7.insert(30);
        myLinkedList7.insert(40);
        myLinkedList7.insert(70);
        myLinkedList7.PrintList();
        //System.out.println("Size of the linkedList: ");
        myLinkedList7.size();

        System.out.println("Search node: 40 ");
        myLinkedList7.search(40);

        System.out.println("Delete node: 40 ");
        myLinkedList7.deleteNode(40);

        myLinkedList7.PrintList();
        myLinkedList7.size();


        /*UC-10 Ability to create Ordered Linked List in ascending order of data entered in following sequence 56, 30, 40, and 70
                - Refactor the code to create SortedLinkedList Class
                - Create Node that takes data that is Comparable
                - Perform Sorting during the add method call
                - Final Sequence: 30->40->56->70*/
        System.out.println();
        System.out.println("<------------Sort node----------->");
        myLinkedList8.insert(56);
        myLinkedList8.insert(30);
        myLinkedList8.insert(40);
        myLinkedList8.insert(70);
        System.out.println("Linked List Before Sorting:");
        myLinkedList8.PrintList();
        myLinkedList8.sort();
        System.out.println("Linked List After Sorting:");
        myLinkedList8.PrintList();
    }
}
