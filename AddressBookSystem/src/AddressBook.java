import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Person> personArrayList = new ArrayList<Person>();
    ArrayList<AddressBookManager> addressBookManager = new ArrayList<>();

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        addressBook.getMenuList();
    }

    private void getMenuList() {

        long choice = -1;
        while (choice != 0) {
            System.out.println("**********************************");
            System.out.println("1. Add address book");
            System.out.println("2. Exit");
            System.out.println("**********************************");
            choice = readLongInput("Enter choice : ");

            switch ((int) choice) {
                case 1 :
                    addAddressBook();
                    break;
                case 2 :
                    choice = 0;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private void addAddressBook() {
        String name = readStringInput("Enter address book name : ");
        AddressBookManager addBookMgr = new AddressBookManager(name);
        addressBookManager.add(addBookMgr);
        getList();
    }

    public void getList () {
        long choice = -1;
        while (choice != 0) {
            System.out.println("**********************************");
            System.out.println("1. Add Person");
            System.out.println("2. Show Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.println("**********************************");
            choice = readLongInput("Enter choice : ");

            switch ((int) choice) {
                case 1 :
                    addContact();
                    break;
                case 2 :
                    showContacts();
                    break;
                case 3 :
                    editContact();
                    break;
                case 4 :
                    deleteContact();
                    break;
                case 5 :
                    choice = 0;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public long readLongInput(String displayMsg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(displayMsg);
        long inputLong = sc.nextLong();

        return  inputLong;
    }

    public String readStringInput(String displayMsg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(displayMsg);
        String inputStr = sc.next();

        return  inputStr;
    }

    private void addContact() {
        String firstName = readStringInput("Enter first name : ");
        String lastName = readStringInput("Enter last name : ");
        String address = readStringInput("Enter address : ");
        String city = readStringInput("Enter city : ");
        String email = readStringInput("Enter email : ");
        long phoneNumber = readLongInput("Enter phone number : ");
        long zipCode = readLongInput("Enter zip code : ");

        Person person =new Person(firstName, lastName, address, city, email, phoneNumber, zipCode);
        personArrayList.add(person);

        System.out.println("Successfully added");
    }

    private void showContacts() {
        for (Person per : personArrayList) {
            System.out.println("******************************************");
            System.out.println("First name      : " + per.getFirstName());
            System.out.println("Last name       : " + per.getLastName());
            System.out.println("Address         : " + per.getAddress());
            System.out.println("City            : " + per.getCity());
            System.out.println("Email           : " + per.getEmail());
            System.out.println("Phone number    : " + per.getPhoneNumber());
            System.out.println("Zip code        : " + per.getZipCode());
            System.out.println("******************************************");
        }

        if (personArrayList.isEmpty()) {
            System.out.println("Address book is empty");
        }
    }

    private void editContact() {
        int check = checkPerson();
        String continueEdit = "";
        do {
            if (check != -1) {
                String options = "What to change ? \n1. First Name  \n2. Last Name  " +
                        "\n3. Address \n4. City \n5. Email " +
                        "\n6. Phone number  \n7. Zip code  " +
                        "\nEnter option : ";
                int option = (int) readLongInput(options);
                switch (option) {
                    case 1:
                        personArrayList.get(check).setFirstName(readStringInput("Enter first name : "));
                        System.out.println("First name modified");
                        break;
                    case 2:
                        personArrayList.get(check).setLastName(readStringInput("Enter last name : "));
                        System.out.println("Last name modified");
                        break;
                    case 3:
                        personArrayList.get(check).setAddress(readStringInput("Enter address : "));
                        System.out.println("Address modified");
                        break;
                    case 4:
                        personArrayList.get(check).setCity(readStringInput("Enter city : "));
                        System.out.println("City modified");
                        break;
                    case 5:
                        personArrayList.get(check).setEmail(readStringInput("Enter email : "));
                        System.out.println("Email modified");
                        break;
                    case 6:
                        personArrayList.get(check).setPhoneNumber(readLongInput("Enter phone number : "));
                        System.out.println("Phone number modified");
                        break;
                    case 7:
                        personArrayList.get(check).setZipCode(readLongInput("Enter zip code : "));
                        System.out.println("Zip code modified");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
            else {
                System.out.println("No such person found");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue (y/n) : ");
            continueEdit = sc.next();
        }
        while (continueEdit.equalsIgnoreCase("Y"));
    }

    private int checkPerson() {
        String fstNm =readStringInput("Enter first name : ");
        int checkPer = 0;
        for (Person per : personArrayList) {
            if (per.getFirstName().equals(fstNm)) {
                return checkPer;
            }
            checkPer ++;
        }
        return -1;
    }

    private void deleteContact () {
        int choice = checkPerson();
        if (choice != -1) {
            Person per = personArrayList.remove(choice);
            System.out.println(per.getFirstName() + " deleted successfully");
        }
        else {
            System.out.println("No data found");
        }
    }
}
