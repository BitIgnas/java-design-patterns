package design_patterns.factory;

public class VehicleFactory {

    private VehicleFactory() {

    }

    public static Vehicle getVehicleByType(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car("Car", 120);
            case BOAT:
                return new Boat("Boat", 40);
            case PLANE:
                return new Plane("Plane", 200);
            default:
                throw new RuntimeException("Vehicle type is invalid");
        }
    }
}
