//Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter the number to find if it is a odd number or a even number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0) {
            System.out.println(n+" is a Even number");
        }
        else {
            System.out.println(n+" is a Odd number");
        }
    }
}
