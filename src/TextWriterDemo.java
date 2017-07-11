import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.File;
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

        File f = new File("test.txt");

        File dir = new File("Java_JuneFiles");
        dir.mkdir();

        //list all contents in a directory (similiar to ls command line)

        if(dir.isDirectory())
        {
            String[] dirContents = dir.list();
            for (int i = 0; i <dirContents.length ; i++) {
                System.out.println(dirContents[i]);

            }
        }
    }
}
