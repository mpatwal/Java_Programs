public class qn15 {
    // Declare two string type variables
    String str1 = "Welcome to Java tutorial";
    String str2 = "Todays topic is String Handling in Java";

    // Method to perform various operations on strings
    public void performOperations() {
        // j. Concatenate two strings
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concatenated);

        // k. Convert str1 into lower case
        String lowerCaseStr1 = str1.toLowerCase();
        System.out.println("str1 in Lower Case: " + lowerCaseStr1);

        // l. Convert str2 into upper case
        String upperCaseStr2 = str2.toUpperCase();
        System.out.println("str2 in Upper Case: " + upperCaseStr2);

        // m. Check if both strings are equal
        boolean areEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + areEqual);

        // n. Show the location of "J" in both str1 and str2
        int indexJInStr1 = str1.indexOf('J');
        int indexJInStr2 = str2.indexOf('J');
        System.out.println("Location of 'J' in str1: " + indexJInStr1);
        System.out.println("Location of 'J' in str2: " + indexJInStr2);

        // o. Replace "i" with "I" in both the strings
        String replacedStr1 = str1.replace('i', 'I');
        String replacedStr2 = str2.replace('i', 'I');
        System.out.println("str1 after replacing 'i' with 'I': " + replacedStr1);
        System.out.println("str2 after replacing 'i' with 'I': " + replacedStr2);

        // p. Display "java" from str2 (case-insensitive search for "Java")
        String extractedJava = "";
        int startIndex = str2.toLowerCase().indexOf("java");
        if (startIndex != -1) {
            extractedJava = str2.substring(startIndex, startIndex + 4);
        }
        System.out.println("Extracted 'java' from str2: " + extractedJava);

        // q. Display the 7th character in str1
        char seventhChar = str1.charAt(6); // Index 6 because indexing starts from 0
        System.out.println("7th Character in str1: " + seventhChar);

        // Convert str1 into a string array
        String[] str1Array = str1.split(" ");
        System.out.println("str1 as String Array:");
        for (String word : str1Array) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        // Create an object of MyString class
        qn15 myString = new qn15();
        // Perform operations on strings
        myString.performOperations();
    }
}
