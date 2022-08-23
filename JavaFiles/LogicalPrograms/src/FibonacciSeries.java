/*Fibonacci Series
        Fibonacci series is a special type of series in which the next term is the sum of the
        previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
        the next term will be 1(0+1).*/

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number up to which you want the fibonacci series : ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series is : ");

        for(i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }
}
