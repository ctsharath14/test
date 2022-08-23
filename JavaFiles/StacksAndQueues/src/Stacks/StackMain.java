package Stacks;

public class StackMain {
    public static void main(String[] args) {
        StackOperation list = new StackOperation();
        StackOperation list1 = new StackOperation();

        /*UC-1 Ability to create a Stack of 56->30->70
                - Use LinkedList to do the Stack Operations
                - Here push will internally call add method on LinkedList.
                - So 70 will be added first then 30 and then 56 to make 56 on top of the Stack.*/
        System.out.println("Stack data are :");
        list.push(70);
        list.push(30);
        list.push(56);
        list.printList();


        /*Ability to peak and pop from the Stack till it is empty 56->30->70
                - Use LinkedList to do the Stack Operations*/
        System.out.println();
        System.out.println("Peak and Pop");
        list.push(70);
        list.push(30);
        list.push(56);
        list.peak();
        list.pop();
        list.peak();
        list.pop();
        list.peak();
        list.pop();
        list.peak();
        list.printList();
    }
}
