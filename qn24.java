import java.util.Scanner;
class InvalidPercentageException extends Exception {
        public InvalidPercentageException(String message) {
        super(message);
    }
}
class Student {
     String firstName;
     String lastName;
     String qualification;
     double percentage;
     int totalMarks;
    public Student(String firstName, String lastName, String qualification, double percentage, int totalMarks) throws InvalidPercentageException {
        if (percentage < 0 || percentage > 100) {
                        throw new InvalidPercentageException("Percentage must be between 0 and 100."); }
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualification = qualification;
        this.percentage = percentage;
        this.totalMarks = totalMarks;
    }
     public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Percentage: " + percentage);
        System.out.println("Total Marks: " + totalMarks);
    }
}
public class qn24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Qualification: ");
            String qualification = scanner.nextLine();
            System.out.print("Enter Percentage: ");
            double percentage = scanner.nextDouble();
            System.out.print("Enter Total Marks: ");
            int totalMarks = scanner.nextInt();
            Student student = new Student(firstName, lastName, qualification, percentage, totalMarks);
            student.displayDetails();}
            catch (InvalidPercentageException e) {
            System.out.println("Error: " + e.getMessage()); }
            catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage()); }
    }
}
