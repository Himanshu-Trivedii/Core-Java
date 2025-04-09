package Constructors;

class Vehicle {
    String type;
    int wheels;

    // Constructor 1
    Vehicle() {
        this("Car"); // ✅ Calls Constructor 2
        System.out.println("Default Constructor");

    }

    // Constructor 2 (Single Parameter)
    Vehicle(String type) {
        this(type, 4); // ✅ Calls Constructor 3
        System.out.println("Single Parameter Constructor: " + type);
    }

    // Constructor 3 (Two Parameters)
    Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
        System.out.println("Two Parameter Constructor: " + type + " - " + wheels);
    }
}


