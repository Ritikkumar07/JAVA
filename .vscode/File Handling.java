import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        // Write to file
        FileWriter writer = new FileWriter("data.txt");
        writer.write("Hello Java File!");
        writer.close();

        // Read from file
        FileReader reader = new FileReader("data.txt");
        int ch;
        while((ch = reader.read()) != -1) {
            System.out.print((char)ch);
        }
        reader.close();
    }
}
