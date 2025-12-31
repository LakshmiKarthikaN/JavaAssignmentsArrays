package Learning.interfaceclasses;
abstract class Vehicle {
    int speed;

    // Constructor
    Vehicle(int speed) {
        this.speed = speed;
    }

    // Abstract method
    abstract void start();

    // Non-abstract method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
interface MusicPlayer {
    void playMusic();  // implicitly public and abstract
}
class Car extends Vehicle implements MusicPlayer {

    Car(int speed) {
        super(speed);
    }

    // Implement abstract method from Vehicle
    @Override
   void start() {
        System.out.println("Car started at speed: " + speed);
    }

    // Implement interface method
    @Override
    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(80);
        myCar.start();        // from abstract class
        myCar.playMusic();    // from interface
        myCar.stop();         // concrete method from abstract class
    }
}
