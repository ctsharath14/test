/*2D Array
        a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
        standard input and printing them out to standard output.
        b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
        c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
        d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
        OutputStreamWriter to print the output to the screen.*/

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row, col, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the number of columns");
        col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter Array Elements");

        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                System.out.print("Enter value for : ["+i+"]["+j+"] : \t");
                arr[i][j] = sc.nextInt();
            }
        }
        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
