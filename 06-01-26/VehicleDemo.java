class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
        System.out.println("Vehicle constructor called. Speed = " + speed);
    }
}

class Car extends Vehicle {
    Car(int speed) {
        super(speed); 
        System.out.println("Car constructor called. Speed = " + this.speed);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car(120);
    }
}
