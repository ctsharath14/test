package Banking;

public class BankMain {
    public static void main(String[] args) {
        BankOperations banking = new BankOperations();
        banking.createAccount();
        banking.moneyDeposit();
    }
}
