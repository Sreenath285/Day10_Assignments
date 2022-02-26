import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookManager {

    HashMap<String, AddressBookService> addressBookHashMap =new HashMap<String, AddressBookService>();
    Scanner sc = new Scanner(System.in);

    public void addAddressBook() {
        System.out.print("Enter address book name : ");
        String addressBookName = sc.next();
            AddressBookService addressBookService = new AddressBookService();
            addressBookHashMap.put(addressBookName, addressBookService);
            addressBookHashMap.get(addressBookName).getMenu();

    }

    public void showAddressBook () {
        for (String str : addressBookHashMap.keySet()){
            System.out.println(str);
            System.out.println(addressBookHashMap.get(str).personArrayList);
        }
    }
}
