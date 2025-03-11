import java.time.LocalDate;

public class Identifier
{
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String address;

    public Identifier() {

    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setBirthdate(String birthdate)
    {
        this.birthdate = LocalDate.parse(birthdate);
    }
    public void setAddress(String address)
    {
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public String getAddress() {
        return address;
    }


}
