/*Power of 2
        a. Desc -> This program takes a command-line argument N and prints a table of the
        powers of 2 that are less than or equal to 2^N.
        b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
        c. Logic -> repeat until i equals N.
        d. O/P -> Print the year is a Leap Year or not.*/

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter a number below 31 up to which you want the power of 2");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n >= 31) {
            System.out.println("Number entered is invalid");
            return;
        }
        else {
            for (i = 0; i <= n; i ++) {
                double power = Math.pow(2,i);
                System.out.println("2 power of "+i+" is :\t"+power);
            }
        }
    }
}
