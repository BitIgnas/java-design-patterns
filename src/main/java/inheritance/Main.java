package inheritance;

public class Main {


    public static void main(String[] args) {
        Vehicle vehicle = new Car("Car", 100);
        Car car = new Car("Car", 200, "Sedan", 4);
        System.out.println(vehicle.getSpeed());
        System.out.println(car.getSpeed());
        car.body = "Coupe";
        System.out.println(car.body);

        Vehicle vehicle1;


    }
}
