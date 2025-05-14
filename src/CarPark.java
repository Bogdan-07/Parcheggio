import java.util.ArrayList;

public class CarPark {
    private final ArrayList<Vehicle> carParkManager;

    //Constructor

    public CarPark(){
        carParkManager = new ArrayList<>();
    }

    // carPark Methods

    public void addVehicle(Vehicle inputVehicle){
        carParkManager.add(inputVehicle);
    }
    public Vehicle searchVehicle(String inputLP){
        if (carParkManager.isEmpty())
            return null;
        for(Vehicle temp : carParkManager){
            if (temp.getLicensePlate().equals(inputLP.toUpperCase()))
                return temp;
        }
        return null;
    }
    public int removeVehicle(String inputLP){
        if (carParkManager.isEmpty())
            return -1;
        for(Vehicle temp : carParkManager){
            if (temp.getLicensePlate().equals(inputLP.toUpperCase())) {
                carParkManager.remove(temp);
                return 0;
            }
        }
        return -1;
    }

    // toString

    public String toString() {
        String a = "";
        for(Vehicle temp : carParkManager){
            a += temp.toString();
        }
        return a;
    }
}