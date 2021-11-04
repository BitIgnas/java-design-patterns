package inheritance;

public abstract class Vehicle {
    private String type;
    private int speed;

    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    abstract void move();
    abstract void move(int timeToStop);
    abstract void stop();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
