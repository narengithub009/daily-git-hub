import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactManager {
    private ArrayList<String> contacts;
    private static final Logger LOGGER = Logger.getLogger(ContactManager.class.getName());

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(String contact) {
        contacts.add(contact);
        LOGGER.info("Contact added " + contact);
    }

    public void removeContact(String contact) {
        if (contacts.remove(contact)) {
            LOGGER.info("Contact removed " + contact);
        } else {
            LOGGER.info("Contact not found " + contact);
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            LOGGER.info("No contacts found");
        } else {
            LOGGER.info("Contacts...");
            for (String contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public static void main(String[] args) {
        LOGGER.setLevel(Level.ALL);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        LOGGER.addHandler(consoleHandler);

        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter the contact name :");
                    String newContact = scanner.nextLine();
                    contactManager.addContact(newContact);
                    break;
                case "2":
                    System.out.println("Enter contact name to remove ");
                    String contactToRemove = scanner.nextLine();
                    contactManager.removeContact(contactToRemove);
                    break;
                case "3":
                    contactManager.displayContacts();
                    break;
                case "4":
                    System.out.println("Exiting ....");
                    break;
                default:
                    System.out.println("Invalid choice, please try again...");

            }
        } while (!choice.equals("4"));
        scanner.close();
    }
}
