package inheritance;

public class Car extends Vehicle {
    String body;
    private int doorCount;

    public Car(String type, int speed, String body, int doorCount) {
        super(type, speed);
        this.body = body;
        this.doorCount = doorCount;
    }

    public Car(String type, int speed) {
        super(type, speed);
    }

    @Override
    void move() {
        System.out.println("Car is moving");
    }

    @Override
    void move(int timeToStop) {
        System.out.println("Car is moving until stopping " + timeToStop);
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
