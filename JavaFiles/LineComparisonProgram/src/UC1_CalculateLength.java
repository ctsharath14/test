/*As a fan of geometry, I want to
        model a line based on a point
        consisting of (x, y) co-ordinates
        using the Cartesian system,
        So that I can calculate its
        length.
        - A Length as 2 Points (x1, y1) and (x2, y2)
        - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)*/

import java.util.Scanner;

public class UC1_CalculateLength {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X1 co-ordinate value");
        int x1 = sc.nextInt();
        System.out.println("Enter the Y1 co-ordinate value");
        int y1 = sc.nextInt();
        System.out.println("Enter the X2 co-ordinate value");
        int x2 = sc.nextInt();
        System.out.println("Enter the Y2 co-ordinate value");
        int y2 = sc.nextInt();
        sc.close();

        //Formula
        double length = (Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2))));
        System.out.println("Length of the line is : "+length);
    }
}
