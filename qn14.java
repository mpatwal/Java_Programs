import java.util.Scanner;

// Define the Student class
class Student {
    // Attributes of the Student class
    String name;
    int rollNo;

    // Constructor to initialize Student object
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class qn14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Student objects to store 3 students
        Student[] students = new Student[3];

        // Accept details for 3 students
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create a new Student object and add it to the array
            students[i] = new Student(name, rollNo);
        }

        // Display details of all students
        System.out.println("\nDisplaying Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}
