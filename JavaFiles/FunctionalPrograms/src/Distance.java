//Program that takes two integer command-line arguments x and y and prints the Euclidean distance
// from the point (x, y) to the origin (0, 0).

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X-axis");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y-axis");
        int y = sc.nextInt();
        sc.close();
        double dist = Math.sqrt((x*x) + (y*y));
        System.out.println("Distance from ("+x+","+y+") to (0,0) = "+dist);
    }
}
