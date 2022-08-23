import java.util.Scanner;

public class AddressBookMain {
    public static  void main(String[] args){
        System.out.println("Welcome to a address book program");
        AddressBook addressBook = new AddressBook();

        int choice;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kindly enter the choice");
            System.out.println("1 - Add contact");
            System.out.println("2 - Edit contact");
            System.out.println("3 - Delete contact");
            System.out.println("4 - Display Contact");
            System.out.println("5 - Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact(); //Add multiple contacts-UC5
                    break;
                case 2:
                    addressBook.editContact();;
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter the correct choice");

            }
        }
    }
}
