import java.util.Scanner;

// Define the Person class
class Person {
    // Instance variables
    String name;
    String gender;
    String address;
    String contactNo;

    // Method to accept details from the user
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Gender: ");
        gender = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        contactNo = scanner.nextLine();
    }

    // Method to display details
    public void display() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNo);
    }
}

public class qn19 {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        // Call the accept() method to take input
        person.accept();

        // Call the display() method to show the details
        person.display();
    }
}
