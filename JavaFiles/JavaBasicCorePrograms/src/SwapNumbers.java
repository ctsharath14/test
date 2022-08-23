//Java Program to Swap Two Numbers

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sc.close();

        System.out.println("Number before swapping is : "+a+"\t"+b);
        c = a;
        a = b;
        b = c;
        System.out.println("Number after swapping is : "+a+"\t"+b);
    }
}
