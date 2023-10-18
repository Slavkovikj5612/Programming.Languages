public class Car {
    private String make;
    private String model;
    private int year;
    private int numSeats;

    // Parameterized constructor
    public Car(String make, String model, int year, int numSeats) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numSeats = numSeats;
    }

    // Constructor without parameters
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.numSeats = 0;
    }

    // Getters and setters for each attribute
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    // Method to display car specifications
    public void spec() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Number of Seats: " + numSeats);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        // Create a car with the parameterized constructor
        Car car1 = new Car("Toyota", "Camry", 2022, 5);

        // Create a car with the constructor without parameters
        Car car2 = new Car();

        // Invoke get methods for both cars
        System.out.println("Car 1 Make: " + car1.getMake());
        System.out.println("Car 2 Make: " + car2.getMake());

        // Assign values to the attributes of the second car using set methods
        car2.setMake("Ford");
        car2.setModel("Focus");
        car2.setYear(2021);
        car2.setNumSeats(4);

        // Invoke get methods for the second car
        System.out.println("Car 2 Make: " + car2.getMake());

        // Compare the number of passengers (seats)
        if (car1.getNumSeats() > car2.getNumSeats()) {
            System.out.println("Car 1 has more passenger seats.");
        } else if (car2.getNumSeats() > car1.getNumSeats()) {
            System.out.println("Car 2 has more passenger seats.");
        } else {
            System.out.println("Both cars have the same number of passenger seats.");
        }

        // Display car specifications
        System.out.println("Car 1 Specifications:");
        car1.spec();

        System.out.println("Car 2 Specifications:");
        car2.spec();
    }
}
