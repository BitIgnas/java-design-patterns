package design_patterns.factory;

public class Plane extends Vehicle {

    private String type;
    private Integer speed;

    public Plane(String type, Integer speed) {
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
        return true;
    }

    @Override
    public void move() {
        System.out.println("Plane is flying");
    }
}
