// Abstract class IP
abstract class IP {
    // Defined method: external_Exam
    public void external_Exam() {
        System.out.println("External Exam conducted by the University.");
    }

    // Defined method: internal_Exam
    public void internal_Exam() {
        System.out.println("Internal Exam conducted by the Institute.");
    }

    // Abstract method: Assignment
    public abstract void Assignment();

    // Abstract method: performance_Evaluation
    public abstract void performance_Evaluation();
}

// Class JIMS inherits from abstract class IP
class JIMS extends IP {
    // Implementation of abstract method: Assignment
    @Override
    public void Assignment() {
        System.out.println("Assignments are given for each subject.");
    }

    // Implementation of abstract method: performance_Evaluation
    @Override
    public void performance_Evaluation() {
        System.out.println("Performance Evaluation is based on exams and assignments.");
    }

    // Additional method: talent_Hunt
    public void talent_Hunt() {
        System.out.println("Talent Hunt event is organized to discover new talents.");
    }
}

// Main class to test the implementation
public class qn23 {
    public static void main(String[] args) {
        // Creating an object of JIMS class
        JIMS jims = new JIMS();

        // Calling all methods
        jims.external_Exam();             // Defined in IP
        jims.internal_Exam();             // Defined in IP
        jims.Assignment();                // Implemented in JIMS
        jims.performance_Evaluation();    // Implemented in JIMS
        jims.talent_Hunt();               // Defined in JIMS
    }
}
