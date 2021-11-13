package design_patterns.factory;

public class Car extends Vehicle {

    private String type;
    private Integer speed;

    public Car(String type, Integer speed) {
        this.type = type;
        this.speed = speed;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Integer getSpeed() {
        return this.speed;
    }

    @Override
    public boolean isFlyingVehicle() {
        return false;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
