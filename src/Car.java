public class Car extends Vehicle {
    private int doorNr;

    // Constructor

    public Car(String brand,String model,String licensePlate, int hp, float weight, int doorNr){
        super(brand, model, licensePlate, hp, weight);
        this.doorNr = doorNr;
    }

    // Get

    public int getDoorNr(){
        return doorNr;
    }

    // toString

    public String toString() {
        return super.toString() +
                "\tNumber of doors: " + doorNr + "\n";
    }
}