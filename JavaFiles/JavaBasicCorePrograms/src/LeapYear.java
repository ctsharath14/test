/*Leap Year
        a. I/P -> Year, ensure it is a 4 digit number.
        b. Logic -> Determine if it is a Leap Year.
        c. O/P -> Print the year is a Leap Year or not.*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year to find if its a leap year or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("Year "+n+" is a leap year");
        }
        else {
            System.out.println("Year "+n+" is not a leap year");
        }
    }
}
