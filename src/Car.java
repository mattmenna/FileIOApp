import java.io.Serializable;

/**
 * Created by Matt on 7/11/2017.
 */
public class Car implements Serializable{
    /* POJO - plain old java object
        no argument constructor
        getter and setters for all private variables
        Implement serializable interface

      The serializable interface is a tagging interface that notifies
       an application that objects can be serialized (aka flattened)
       Typically use serializable for files that only my java app will use

        Using the transient keyword skips the variable from being saved if you use this you will want
        to set the variable to a default value when you deserialize it

    */

    //transient int test;  // this value doesn't get saved because its transient
    private int mileage;
    private String make;

    @Override
    public String toString() {
        return make + " " + mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}