public class Vehicle
{
    private String brand;
    private String model;
    private String licensePlate;
    private int hp;
    private float weight;

    // Constructor

    public Vehicle(String brand,String model,String licensePlate, int hp, float weight) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate.toUpperCase();
        this.hp = hp;
        this.weight = weight;
    }

    // Get

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public int getHp() {
        return hp;
    }
    public float getWeight() {
        return weight;
    }

    // toString

    public String toString() {
        return getClass().getSimpleName()+ ": \n" +
                "\tBrand: " + brand + "\n" +
                "\tModel: " + model + "\n" +
                "\tLicense Place: " + licensePlate + "\n" +
                "\tHorsepower: " + hp + "\n" +
                "\tWeight: " + weight + "\n";
    }
}