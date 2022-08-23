import java.util.Scanner;

public class UC4_LineComparisonUsingOOPS {
    static double x1, x2, y1, y2, a1, b1, a2, b2;
    public static double Length1, Length2;
    Scanner sc = new Scanner(System.in);

    public void Line1() {

        System.out.println("Enter X1 value of first line");
        x1 = sc.nextDouble();
        System.out.println("Enter Y1 value of first line");
        y1 = sc.nextDouble();

        System.out.println("Enter X2 value of first line");
        x2 = sc.nextDouble();
        System.out.println("Enter Y2 value of first line");
        y2 = sc.nextDouble();

        Length1 = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance of first line = " + Length1);
    }

    public void Line2() {

        System.out.println("Enter X1 value of second Line");
        a1 = sc.nextDouble();
        System.out.println("Enter Y1 value of second Line");
        b1 = sc.nextDouble();

        System.out.println("Enter X2 value of second Line");
        a2 = sc.nextDouble();
        System.out.println("Enter Y2 value of second Line");
        b2 = sc.nextDouble();

        Length2 = (double) Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Distance of second line = " + Length2);
    }

    public void Compare() {
        if (Length1 == Length2)
            System.out.println("both lines are equal.");
        else if (Length1 > Length2)
            System.out.println("Line1 length is Greater.");
        else
            System.out.println("Line2 length is Greater.");
    }


    public static void main(String[] args) {

        UC4_LineComparisonUsingOOPS c = new UC4_LineComparisonUsingOOPS();
        c.Line1();
        c.Line2();
        c.Compare();
    }
}
