public class Car extends Vehicle
{
    private int doorNr;
    private float trunkCapacity;
    private boolean combustionEngine;

    public void setDoorNr(int doorNr)
    {
        this.doorNr = doorNr;
    }
    public void setTrunkCapacity(float trunkCapacity)
    {
        this.trunkCapacity = trunkCapacity;
    }
    public void setCombustionEngine(boolean combustionEngine)
    {
        this.combustionEngine = combustionEngine;
    }

    public int getDoorNr()
    {
        return doorNr;
    }
    public float getTrunkCapacity()
    {
        return trunkCapacity;
    }
    public boolean isCombustionEngine()
    {
        return combustionEngine;
    }
}
