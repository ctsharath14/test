public class PrintArray<T> {

    public void toPrint(T[] arr) {
        System.out.println("Integer Array:");
        for (T t : arr) {
            System.out.print(t + "  ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        //printing welcome message
        MaximumTest max = new MaximumTest();
        System.out.println("Welcome to Java Generics Program.");
        Integer[] integerArr = new Integer[] {0,1,2,3,4,5,6,7,8,9};
        PrintArray<Integer> printArr = new PrintArray<Integer>();
        printArr.toPrint(integerArr);
        max.findIntMax();
        System.out.println("Maximum integer at first position");
        max.integerAtFirstPosition();
        System.out.println("Maximum integer at second position");
        max.integerAtSecondPosition();
        System.out.println("Maximum integer at third position");
        max.integerAtThirdPosition();

        System.out.println("\n");
        max.findFloatMaximum();
        System.out.println("Maximum float at first position");
        max.floatAtFirstPosition();
        System.out.println("Maximum float at second position");
        max.floatAtSecondPosition();
        System.out.println("Maximum float at third position");
        max.floatAtThirdPosition();

        System.out.println("\n");
        max.findStringMaximum();
        System.out.println("Maximum string at first position");
        max.stringAtFirstPosition();
        System.out.println("Maximum string at second position");
        max.stringAtSecondPosition();
        System.out.println("Maximum string at third position");
        max.stringAtThirdPosition();





    }

}