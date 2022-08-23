/*Harmonic Number
        a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
        b. I/P -> The Harmonic Value N. Ensure N != 0
        c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
        d. O/P -> Print the Nth Harmonic Value.*/

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double i;
        double sum = 0;
        System.out.println("Enter a number up to which you want the harmonic value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= n; i ++) {
            sum = sum + (1/i);
        }
        sc.close();
        System.out.println(sum);
    }
}
