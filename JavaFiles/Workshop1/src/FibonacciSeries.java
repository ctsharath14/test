import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you need the Fibonacci Series");
        int n = sc.nextInt();

        System.out.println("The fibonacci series is :");
        System.out.print(a + " ");

        for (int i =1; i<n+1; i++) {
            int c = a + b;
            System.out.print(b+ " ");
            a = b;
            b = c;
        }
    }
}
