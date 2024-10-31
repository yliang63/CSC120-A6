/**
 * This class represents a generic building with a name, address, and number of floors. It is the parents class for Cafe, Library and House.
 */
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructs a Cafe object with name, address, number of floors.
     *
     * @param name Name of the building
     * @param address Address of the building
     * @param nFloors Number of floors in the building

     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Get the name of the building.
     *
     * @return Return the name of the building.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the address of the building.
     *
     * @return Return the address of the building.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Get the floor of the building.
     *
     * @return Return the floor of the building.
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns a string representation of the building.
     *
     * @return A string containing the name, number of floors, and address of the building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * Main method to show the functionality of the Building class.
     */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }



}
