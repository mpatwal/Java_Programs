import java.util.Scanner;

// Base Class: Student
class Student {
    // Data members
    String firstName;
    String lastName;
    String qualification;
    double percentage;
    double totalMarks;

    // Method to accept student details
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter Qualification: ");
        qualification = scanner.nextLine();

        System.out.print("Enter Percentage: ");
        percentage = scanner.nextDouble();

        System.out.print("Enter Total Marks: ");
        totalMarks = scanner.nextDouble();
    }

    // Method to display student details
    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Percentage: " + percentage);
        System.out.println("Total Marks: " + totalMarks);
    }
}

// Derived Class: MCA
class MCA extends Student {
    // Data members specific to MCA
    String stream;
    int duration;

    // Method to accept MCA specific details
    public void accept() {
        super.accept(); // Calling the parent class accept() method to accept common details

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Stream: ");
        stream = scanner.nextLine();

        System.out.print("Enter Duration (in years): ");
        duration = scanner.nextInt();
    }

    // Method to display MCA specific details
    public void display() {
        super.display(); // Calling the parent class display() method to display common details

        System.out.println("Stream: " + stream);
        System.out.println("Duration: " + duration + " years");
    }
}

// Derived Class: MBA
class MBA extends Student {
    // Data members specific to MBA
    String stream;
    int duration;

    // Method to accept MBA specific details
    public void accept() {
        super.accept(); // Calling the parent class accept() method to accept common details

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Stream: ");
        stream = scanner.nextLine();

        System.out.print("Enter Duration (in years): ");
        duration = scanner.nextInt();
    }

    // Method to display MBA specific details
    public void display() {
        super.display(); // Calling the parent class display() method to display common details

        System.out.println("Stream: " + stream);
        System.out.println("Duration: " + duration + " years");
    }
}

public class qn21 {
    public static void main(String[] args) {
        // Create an instance of MCA and MBA classes
        MCA mcaStudent = new MCA();
        MBA mbaStudent = new MBA();

        // Accept details for MCA student
        System.out.println("Enter MCA Student Details:");
        mcaStudent.accept();
        
        // Accept details for MBA student
        System.out.println("\nEnter MBA Student Details:");
        mbaStudent.accept();

        // Display MCA student details
        System.out.println("\nMCA Student Details:");
        mcaStudent.display();

        // Display MBA student details
        System.out.println("\nMBA Student Details:");
        mbaStudent.display();
    }
}
