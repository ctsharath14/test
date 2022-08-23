import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Contacts contacts;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> arrayList = new ArrayList<Contacts>();


    //Create new contact-UC1
    public void addContact(){
        contacts = new Contacts();
        System.out.println("Enter the first name");
        contacts.setFirstName(scanner.next());
        System.out.println("enter the last name");
        contacts.setLastName(scanner.next());
        System.out.println("enter the city");
        contacts.setCity(scanner.next());
        System.out.println("enter the state");
        contacts.setState(scanner.next());
        System.out.println("enter the zipcode");
        contacts.setZipCode(scanner.next());
        System.out.println("enter the email");
        contacts.setEmail(scanner.next());
        System.out.println("enter the phone number");
        contacts.setPhoneNumber(scanner.next());
        arrayList.add(contacts);    //Adding new contact-UC2
    }

    //Display contact details
    public void displayContact() {
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i)+"");
        }
    }

    //Editing contact based on person's first name-UC3
    public void editContact() {
        System.out.println("Enter the first name to edit the contact");
        String e = scanner.next();
        contacts = new Contacts();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFirstName().equalsIgnoreCase(e)) {
                System.out.println("Enter the first name");
                arrayList.get(i).setFirstName(scanner.next());
                System.out.println("enter the last name");
                arrayList.get(i).setLastName(scanner.next());
                System.out.println("enter the city");
                arrayList.get(i).setCity(scanner.next());
                System.out.println("enter the state");
                arrayList.get(i).setState(scanner.next());
                System.out.println("enter the zipcode");
                arrayList.get(i).setZipCode(scanner.next());
                System.out.println("enter the email");
                arrayList.get(i).setEmail(scanner.next());
                System.out.println("enter the phone number");
                arrayList.get(i).setPhoneNumber(scanner.next());
            } else {
                System.out.println("contact not found");
            }
        }
    }

    //Deleting the contact based on firstName-UC4
    public void deleteContact(){
        System.out.println("Enter the first name to delete the contact");
        String d = scanner.next();
        contacts = new Contacts();
        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i).getFirstName().equalsIgnoreCase(d)){
                Contacts contactName = arrayList.get(i);
                arrayList.remove(contactName);
                System.out.println("Contact removed successfully");
            }
            else {
                System.out.println("contact not deleted as first name not matched");
            }
        }
    }

}
