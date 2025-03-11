import java.time.LocalDate;

public class Vehicle
{
    private Identifier ID;
    private String licensePlate;
    private String brand;
    private int range;

    public void setID(String firstName, String lastName, String birthdate, String address)
    {
        ID.setFirstName(firstName);
        ID.setLastName(lastName);
        ID.setBirthdate(birthdate);
        ID.setAddress(address);
    }
    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setRange(int range)
    {
        this.range = range;
    }

    public Identifier getID()
    {
        return ID;
    }
    public String getLicensePlate()
    {
        return licensePlate;
    }
    public String getBrand()
    {
        return brand;
    }
    public int getRange()
    {
        return range;
    }

    public void vehicleNoise() {

    }
}
