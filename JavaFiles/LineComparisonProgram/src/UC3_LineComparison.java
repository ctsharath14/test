/*As a fan of geometry, I want to
        compare two lines based on
        the end points, So that I know
        one line is equal, greater or
        less than the other line.
        - Using Java compareTo method to compare 2 Lengths is
        preferable.*/

import java.util.Scanner;

public class UC3_LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation problem");
        Scanner sc = new Scanner(System.in);

        //Input for Line-1
        System.out.println("Enter the X1 co-ordinate value of line 1");
        int x1 = sc.nextInt();
        System.out.println("Enter the Y1 co-ordinate value of line 1");
        int y1 = sc.nextInt();
        System.out.println("Enter the X2 co-ordinate value of line 1");
        int x2 = sc.nextInt();
        System.out.println("Enter the Y2 co-ordinate value of line 1");
        int y2 = sc.nextInt();
        double length1 = (Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2))));
        System.out.println("Length of the line1 is : "+length1);

        //Input for Line-2
        System.out.println("Enter the X1 co-ordinate value of line 2");
        int a1 = sc.nextInt();
        System.out.println("Enter the Y1 co-ordinate value of line 2");
        int b1 = sc.nextInt();
        System.out.println("Enter the X2 co-ordinate value of line 2");
        int a2 = sc.nextInt();
        System.out.println("Enter the Y2 co-ordinate value of line 2");
        int b2 = sc.nextInt();
        double length2 = (Math.sqrt((Math.pow((a2 - a1),2)) + (Math.pow((b2 - b1),2))));
        System.out.println("Length of the line2 is : "+length2);
        sc.close();


        //Comparison
        if (length1 == length2) {
            System.out.println("Both the Lines are equal");
        }
        else if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2");
        }
        else {
            System.out.println("Line 2 is greater than Line 1");
        }
    }
}
