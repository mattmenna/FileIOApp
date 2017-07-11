import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Matt on 7/11/2017.
 */
public class TextWriterDemo {
    public static void main(String[] args) {

        // write to file

        try {
            //if the test.txt file does not exist FileWriter will create it
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello World");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
