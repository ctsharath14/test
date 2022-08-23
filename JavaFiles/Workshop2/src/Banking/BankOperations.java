package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class BankOperations {
    Bank bank;
    Scanner s = new Scanner(System.in);
    ArrayList<Bank> list = new ArrayList<>();


    public void createAccount(){
        System.out.println("Enter account details");
        bank = new Bank();
        System.out.println("Enter your name");
        bank.setName(s.nextLine());
        System.out.println("Enter your age");
        bank.setAge(s.nextInt());
        System.out.println("Enter address");
        bank.setAddress(s.nextLine());
        System.out.println("Account details stored");
        list.add(bank);

    }

    public void moneyDeposit(){
        double amount = 0;
        System.out.println("Enter the amount of money you want to deposit");
        double a = s.nextDouble();
        amount += a;
        System.out.println("Account balance after deposit is : "+amount);
        moneyWithdrawal(amount);
    }


    public void moneyWithdrawal(double amount){
        System.out.println("Enter the amount of money you wish to withdraw");
        double b = s.nextDouble();
        double balance = amount - b;
        if(balance>amount){
            System.out.println("You don't have sufficient fund");
        }
        else{
            System.out.println("Current balance after withdrawal is : "+balance);
        }
    }
}
