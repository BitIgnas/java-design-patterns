package inheritance;

public class Boat extends Vehicle {


    private Boat(String type, int speed) {
        super(type, speed);
    }

    @Override
    void move() {

    }

    @Override
    void move(int timeToStop) {

    }

    @Override
    void stop() {

    }
}
