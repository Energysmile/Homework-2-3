public class Main {
    public static void main(String[] args) {


        Bicycle bicycle1 = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2", 2);

        Car car1 = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);

        Truck truck1 = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 8);


        Bicycle.check(bicycle1);
//        ServiceStation station = new ServiceStation();
//        station.check(car1, null, null);
//        System.out.println();
//        station.check(car2, null, null);
//        System.out.println();
//        station.check(null, bicycle1, null);
//        System.out.println();
//        station.check(null, bicycle2, null);
//        System.out.println();
//        station.check(null, null, truck1);
//        System.out.println();
//        station.check(null, null, truck2);
    }
}