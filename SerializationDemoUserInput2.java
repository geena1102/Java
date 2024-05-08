import java.io.*;
import java.util.Scanner;
class Engine implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private double horsepower;
    public Engine(String type, double horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public double getHorsepower() {
        return horsepower;
    }
    public String toString() {
        return "Engine [type=" + type + ", horsepower=" + horsepower + "]";
    }
}
class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    private String make;
    private String model;
    private transient Engine engine; // transient keyword to prevent engine from being serialized
    public Vehicle(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + ", engine=" + engine + "]";
    }
}
public class SerializationDemoUserInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting engine details from user
        System.out.println("Enter engine type:");
        String type = scanner.nextLine();

        System.out.println("Enter engine horsepower:");
        double horsepower = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        Engine engine = new Engine(type, horsepower);

        // Getting vehicle details from user
        System.out.println("Enter vehicle make:");
        String make = scanner.nextLine();

        System.out.println("Enter vehicle model:");
        String model = scanner.nextLine();

        Vehicle vehicle = new Vehicle(make, model, engine);

        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("vehicle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(vehicle);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in vehicle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        Vehicle deserializedVehicle = null;
        try {
            FileInputStream fileIn = new FileInputStream("vehicle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedVehicle = (Vehicle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Vehicle class not found");
            c.printStackTrace();
            return;
        }

        // Displaying deserialized vehicle
        System.out.println("Deserialized Vehicle:");
        System.out.println(deserializedVehicle);

        scanner.close();
    }
}
