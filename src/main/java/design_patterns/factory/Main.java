package design_patterns.factory;

public class Main {

    public static void main(String[] args) {
        Vehicle plane = VehicleFactory.getVehicleByType(VehicleType.PLANE);
        System.out.println(plane.getSpeed());
        System.out.println(plane.getType());
        System.out.println(plane.isFlyingVehicle());

        Vehicle car = VehicleFactory.getVehicleByType(VehicleType.CAR);
        System.out.println(car.getSpeed());
        System.out.println(car.getType());
        System.out.println(car.isFlyingVehicle());
    }
}
