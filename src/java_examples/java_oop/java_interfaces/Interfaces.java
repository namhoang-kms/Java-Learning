package java_examples.java_oop.java_interfaces;

// Dog "implements" the Animal interface
class Dog implements Animals {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Dog says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Interfaces {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create a Dog object
        myDog.animalSound();
        myDog.sleep();
    }
}
