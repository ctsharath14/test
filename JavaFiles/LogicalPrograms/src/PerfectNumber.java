/*Perfect Number
        a. Just like the Armstrong number, the Perfect Number is also a special type of
        positive number. When the number is equal to the sum of its positive divisors
        excluding the number, it is called a Perfect Number. For example, 28 is the perfect
        number because when we sum the divisors of 28, it will result in the same number.
        The divisors of 28 are 1, 2, 4, 7, and 14. So,
        b. 28 = 1+2+4+7
        c. 28 = 28*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check if it is a perfect number or not");
        int n = sc.nextInt();

        for (int i=1; i<n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum==n) {
            System.out.println("It's a perfect number");
        }
        else {
            System.out.println("It is not a perfect number");

        }
    }
}
