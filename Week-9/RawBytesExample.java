// Reading and Writing Raw Bytes Example
import java.io.*;

public class RawBytesExample {
    public static void main(String[] args) {
        String data = "Hello, Raw Bytes!";

        try (FileOutputStream fos = new FileOutputStream("rawbytes.txt")) {
            byte[] bytes = data.getBytes();

            // Writing raw bytes to file
            fos.write(bytes);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("rawbytes.txt")) {
            // Reading raw bytes from file
            byte[] readBytes = fis.readAllBytes();
            String readData = new String(readBytes);
            System.out.println("Data read from file: " + readData);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
