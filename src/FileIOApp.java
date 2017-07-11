import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

        try {
            //FileOutputStream knows how to connect and create a file
            //if file is being passed in as parameter does not exists it creates one automatically
            FileOutputStream fileStream = new FileOutputStream("testWrite.ser");

            //ObjectOutputStream is a class that lets you write objects, but it can't directly connect to file so needs a helper FileStream
            //this is also called chaining demonstrating refactory design patter
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

        } catch (FileNotFoundException e) {
            System.out.println("Your file was not found contact customer service");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ObjectOutputStream Error");
            e.printStackTrace();
        }

    }
}
