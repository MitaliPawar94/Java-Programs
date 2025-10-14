import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello! This is a file handling demo in Java.");
            fw.close();

            FileReader fr = new FileReader("sample.txt");
            int i;
            System.out.println("File content:");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}