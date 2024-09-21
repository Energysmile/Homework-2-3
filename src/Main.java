import Vehicle.Bicycle;
import Vehicle.Car;
import Vehicle.Truck;

public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();

        Bicycle bicycle1 = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2", 2);

        Car car1 = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);

        Truck truck1 = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 8);


        serviceStation.service(bicycle1);
        serviceStation.service(car1);
        serviceStation.service(truck1);

    }
}