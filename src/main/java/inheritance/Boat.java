package inheritance;

public class Boat extends Vehicle {


    private Boat(String type, int speed) {
        super(type, speed);
    }

    @Override
    void move() {
        System.out.println("Boat is moving");
    }

    @Override
    void move(int timeToStop) {

    }

    @Override
    void stop() {
        System.out.println("Boat is stopping");
    }


}
