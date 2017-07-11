import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.*;

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

        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }
        //get absolute path of a file or directory
        System.out.println(dir.getAbsolutePath());

        //delete a file returns true if succesful
        boolean isDeleted = f.delete();
        System.out.println(isDeleted);

        // read from file
        try {
            File myFile = new File("test.txt");
            // FileReader is a connection stream for characters that connects to a text file

            FileReader reader = new FileReader(myFile);

            //BufferedReader allows the File Reader to chain to it
            //it only goes back to check the file once the buffer is empty
            BufferedReader buff = new BufferedReader(reader);
            //declare a string variable to hold each line as it's read from the file
            String line = null;

            //this while loop says read a line for text then assign it to the string line
            //while that variable is not null keep printing lines
            while ((line = buff.readLine()) != null) { // changed catch to General Exception
                System.out.println(line);
            }
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    } // end main
} // end class
