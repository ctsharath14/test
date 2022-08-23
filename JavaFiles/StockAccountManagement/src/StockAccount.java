import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
    int numberOfStocks;
    final double stockAccountBalance = 100000;
    Stock stock;
    Scanner scanner = new Scanner(System.in);

    ArrayList<Stock> list= new ArrayList<>();

     /*This method uses array list collection to add
     multiple stock information.*/
    void stockPortfolio() {
        System.out.println("Enter total number of individual stocks :");
        numberOfStocks = scanner.nextInt();
        for (int i = 0; i <numberOfStocks; i++) {
            stock = new Stock();
            System.out.println("Enter stock name :");
            stock.setStockName(scanner.next());
            System.out.println("Enter number of shares :");
            stock.setNumberOfShare(scanner.nextInt());
            System.out.println("Enter each share price :");
            stock.setSharePrice( scanner.nextDouble());
            list.add(stock);
            System.out.println("\nStock added.");
        }
    }

    //This method show total value of stocks owned , account balance & debit amount
    void valueOfStock(){
        System.out.println("Stock Account initial balance is : "+stockAccountBalance);
        double totalValue=0;
        for(Stock i : list){
            double stockValue = i.getNumberOfShare()*i.getSharePrice();
            System.out.println("\nStock value of  "+ i.getStockName()+ " is :\n"+ stockValue);
            totalValue+= stockValue;
        }
        System.out.println("\nValue of total stocks is: "+ totalValue);
        double currentBalance = stockAccountBalance - totalValue;
        System.out.println("\nRemaining balance :"+ currentBalance);
        debitAmount(currentBalance);
    }

    //display list of all stocks
    void displayData(){
        for(Stock i : list){
            System.out.println(i);
        }
    }

    void debitAmount(double currentBalance ) {
        System.out.println("\nThe account balance is : \n"+ currentBalance);
        System.out.println("Enter the amount to withdraw : ");
        double debit = scanner.nextDouble();
        double balance = currentBalance - debit;
        if (debit > currentBalance) {
            System.out.println("\nDebit amount exceeded account balance.");
        }
        else {
            System.out.println("\nThe current balance is : "+ balance);
        }

    }
}
