
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BookStoreLog {
    public static void main(String[] args) {
        String fileName = "log.txt";
        String message = "Book order placed at 10:30 AM";  
        File file = new File(fileName);

        
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(message);
            writer.close();
            System.out.println("File created and message written successfully!");
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e.getMessage());
        }

        
        try {
            FileReader reader = new FileReader(file);
            int ch;
            System.out.print(" Message from file: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println("\n File read successfully!");
        } catch (IOException e) {
            System.out.println(" Failed to read file: " + e.getMessage());
        }

        
        if (file.delete()) {
            System.out.println(" File deleted successfully!");
        } else {
            System.out.println( "Failed to delete the file!");
        }
    }
}

