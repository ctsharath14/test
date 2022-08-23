//Java Program to Compute Quotient and Remainder

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter a number to be divided");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a number to be divided with");
        int b = sc.nextInt();
        sc.close();

        int quotient = a/b;
        int remainder = a % b;
        System.out.println("After division the quotient and remainder for the given numbers are :");

        System.out.println("Quotient is : "+quotient);
        System.out.println("Remainder is : "+remainder);
    }
}
