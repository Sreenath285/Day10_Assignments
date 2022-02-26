import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookManager addressBookManager = new AddressBookManager();

        while (true) {
            System.out.println("1. Add address book \n2. Show address book \n3. Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBookManager.addAddressBook();
                    break;
                case 2 :
                    addressBookManager.showAddressBook();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
