class Vehicle {
    void start() {
        System.out.println("Vehicle starts...");
    }
}

class Car extends Vehicle {  // Car inherits Vehicle
    void drive() {
        System.out.println("Car is driving...");
    }
}

@SuppressWarnings("unused")
    class inheritance {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.start(); // from Vehicle
            myCar.drive(); // from Car
        }
    }
