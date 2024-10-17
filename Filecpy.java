import java.io.*;

public class Filecpy {
    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileOutputStream f2 = null;
        int c; // declare the variable c as an integer

        try {
            f1 = new FileInputStream("test.txt");
            f2 = new FileOutputStream("cp.txt");
            do {
                c = f1.read(); // read the file
                if (c != -1) {
                    f2.write(c); // write to the file
                    System.out.print((char) c); // print to the console
                }
            } while (c != -1);
        } catch (FileNotFoundException e) {
        System.out.println("Oops!");
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        } finally {
            try {
                if (f1 != null)
                    f1.close(); // close the input stream
                if (f2 != null)
                    f2.close(); // close the output stream
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

