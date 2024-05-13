package java_examples.java_oop.oop_pillars.inheritance;

class Vehicle {
    protected String brand = "Honda";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    private String modelName = "Civic";    // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

class Motorcycle extends Vehicle {
    private String modelName = "CBR";    // Motorcycle attribute

    public static void main(String[] args) {

        // Create a myMotorcycle object
        Motorcycle myMotorcycle = new Motorcycle();

        // Call the honk() method (from the Vehicle class) on the myMotorcycle object
        myMotorcycle.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Motorcycle class
        System.out.println(myMotorcycle.brand + " " + myMotorcycle.modelName);
    }
}