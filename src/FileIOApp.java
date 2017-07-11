import java.io.*;

/**
 * Created by Matt on 7/11/2017.
 */
public class FileIOApp {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Mercedes");
        car.setMileage(5);
        System.out.println(car);

        //this section is writing to a file

        writeToFile(car);

        // this section is reading from the file
        // if the file that we're trying too read from does not exist
        // we're going to get an exception

        readFromFile();

    } // end Main

    private static void readFromFile() {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("testWrite.ser"));
            Car carRestore = (Car) is.readObject();
            System.out.println("Type is: " + carRestore.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(Car car) {
        try {
            //FileOutputStream knows how to connect and create a file
            //if file is being passed in as parameter does not exists it creates one automatically
            FileOutputStream fileStream = new FileOutputStream("testWrite.ser");

            //ObjectOutputStream is a class that lets you write objects, but it can't directly connect to file so needs a helper FileStream
            //this is also called chaining demonstrating refactory design patter
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            // this method serializes the object
            os.writeObject(car);

            // best practice
            os.close();

        } catch (FileNotFoundException e) {
            System.out.println("Your file was not found contact customer service");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ObjectOutputStream Error");
            e.printStackTrace();
        }
    }
}
