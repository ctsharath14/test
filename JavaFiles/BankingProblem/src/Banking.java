import java.util.Scanner;

public class Banking {
    String name;
    long accNum;
    double balance = 0;
    Scanner s = new Scanner(System.in);


    public void createAccount(String name, long accNum){
        this.name = name;
        this.accNum = accNum;
        System.out.println("Welcome "+name+", Acc. Num : "+accNum);
    }

    public void deposit() {
        System.out.println("Enter the amount of money you want to deposit");
        double dep = s.nextDouble();
        balance = balance + dep;
        System.out.println("Balance after deposit is : "+balance);
    }

    public void withdraw() {
        System.out.println("Enter the amount of money you want to withdraw");
        double w = s.nextDouble();
        balance = balance - w;
        System.out.println("Balance after withdrawal is : "+balance);
    }

    public void display() {
        double d = balance;
        System.out.println("Current available balance is : "+balance);
    }

    public void main() {
        while(true) {
            System.out.println("Select your option");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Display Balance");
            System.out.println("4 - Exit");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    return;
            }
        }
    }

    public static void main(String[] args) {
        Banking banking = new Banking();
        banking.createAccount("Sharath", 354862113);
        banking.main();
    }
}
