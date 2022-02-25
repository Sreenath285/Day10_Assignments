import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Person> personArrayList = new ArrayList<Person>();

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        addressBook.getList();
    }

    public void getList () {
        long choice = -1;
        while (choice != 0) {
            System.out.println("**********************************");
            System.out.println("1. Add Person");
            System.out.println("2. Show Contacts");
            System.out.println("3. Exit");
            System.out.println("**********************************");
            choice = readLongInput("Enter choice : ");

            switch ((int) choice) {
                case 1 :
                    addPerson();
                    break;
                case 2 :
                    showContacts();
                    break;
                case 3 :
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

    private void addPerson() {
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
            System.out.println("First name      : " + per.getFirstName());
            System.out.println("Last name       : " + per.getLastName());
            System.out.println("Address         : " + per.getAddress());
            System.out.println("City            : " + per.getCity());
            System.out.println("Email           : " + per.getEmail());
            System.out.println("Phone number    : " + per.getPhoneNumber());
            System.out.println("Zip code        : " + per.getZipCode());
        }

        if (personArrayList.isEmpty()) {
            System.out.println("Address book is empty");
        }
    }
}
