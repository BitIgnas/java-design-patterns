package design_patterns.factory;

public abstract class Vehicle {

    public abstract String getType();
    public abstract Integer getSpeed();

    public abstract boolean isFlyingVehicle();
    public abstract void move();
}
