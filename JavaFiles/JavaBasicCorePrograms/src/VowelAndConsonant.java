//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a alphabet to check if it is Vowel or a Consonant");
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        sc.close();
        switch (alpha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(alpha+" is a Vowel");
                break;

            default:
                System.out.println(alpha+" is a Consonant");
                break;
        }
    }
}
