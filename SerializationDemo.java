import java.io.*;
import java.util.Scanner;

// Base class (parent)
class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + "]";
    }
}

// Derived class (child)
class MarutiCar extends Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    private int year;

    public MarutiCar(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MarutiCar [make=" + getMake() + ", model=" + getModel() + ", year=" + year + "]";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting Maruti car details from user
        System.out.println("Enter Maruti car make:");
        String make = scanner.nextLine();

        System.out.println("Enter Maruti car model:");
        String model = scanner.nextLine();

        System.out.println("Enter Maruti car year:");
        int year = scanner.nextInt();

        MarutiCar car = new MarutiCar(make, model, year);

        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("maruti_car.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(car);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in maruti_car.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        MarutiCar deserializedCar = null;
        try {
            FileInputStream fileIn = new FileInputStream("maruti_car.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedCar = (MarutiCar) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("MarutiCar class not found");
            c.printStackTrace();
            return;
        }

        // Displaying deserialized car
        System.out.println("Deserialized MarutiCar:");
        System.out.println(deserializedCar);

        scanner.close();
    }
}
