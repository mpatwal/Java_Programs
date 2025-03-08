import java.io.*;

public class qn30 {
    public static void main(String[] args) {
        // Example byte data input (using ByteArrayInputStream for demonstration)
        byte[] byteData = "Hello, Byte Stream!".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteData);
        
        // Reading byte data using BufferedInputStream
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream)) {
            System.out.println("Reading Byte Data:");
            int byteValue;
            while ((byteValue = bufferedInputStream.read()) != -1) {
                // Print each byte as a character
                System.out.print((char) byteValue);
            }
            System.out.println("\nByte Data Reading Completed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Example character data input (using StringReader for demonstration)
        String characterData = "Hello, Character Stream!";
        StringReader stringReader = new StringReader(characterData);
        
        // Reading character data using BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(stringReader)) {
            System.out.println("Reading Character Data:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Character Data Reading Completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
