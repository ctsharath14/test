 /*Flip Coin and print percentage of Heads and Tails
        a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
        b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
        heads
        c. O/P -> Percentage of Head vs Tails*/

 import java.util.Scanner;

 public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int i;
        System.out.println("How many times you want to flip the coin");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= n; i ++) {
            int outcome = (int)(Math.random() * 2);
            switch (outcome) {
                case 1:
                    head ++;
                    break;

                default:
                    tail ++;
                    break;
            }
        }
        sc.close();
        System.out.println("Total number of head is : "+head);
        System.out.println("Total number of tail is : "+tail);
        int headCount = (head * 100)/n;
        int tailCount = (tail * 100)/n;
        System.out.println("Total head percentage is : "+headCount+"%");
        System.out.println("Total tail percentage is : "+tailCount+"%");
    }
}
