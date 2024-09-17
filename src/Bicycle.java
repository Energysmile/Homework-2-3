public class Bicycle extends Vehicle implements Service{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void check(Bicycle bicycle1) {
    }

    @Override
    public void check() {
        System.out.println("Bicycle check");
    }
}