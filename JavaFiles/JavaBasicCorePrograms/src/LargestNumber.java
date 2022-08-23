//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        sc.close();

        if (a>b && a>c) {
            System.out.println("Number "+a+" is the largest of all");
        }
        else if (b>c) {
            System.out.println("Number "+b+" is the largest of all");
        }
        else {
            System.out.println("Number "+c+" is the largest of all");
        }
    }
}
