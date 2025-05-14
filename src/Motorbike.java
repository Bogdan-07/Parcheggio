public class Motorbike extends Vehicle{
    private int cc;
    private boolean sideCar;

    // Constructor

    public Motorbike(String brand, String model, String licensePlate, int hp, float weight, int cc, boolean sideCar) {
        super(brand, model, licensePlate, hp, weight);
        this.cc = cc;
        this.sideCar = sideCar;
    }

    // Get

    public int getCc() {
        return cc;
    }
    public boolean isSideCar() {
        return sideCar;
    }

    // toString

    public String toString() {
        return super.toString() +
                "\tCubic centimeters: " + cc + "\n" +
                "\tHas sidecar: " + sideCar + "\n";
    }

}
