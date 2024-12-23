/* This is a stub for the House class */
import java.util.ArrayList;

/**
 * The class respresents the building class and manages the residents in the house.
 */

public class House extends Building {
    private ArrayList<String> residents;
    private boolean hasDiningRoom;

    /**
     * Construct with provided name, address, floors number and dining hall status.
     *
     * @param name Name of the house
     * @param address Address of the house
     * @para nFloors FLoors number in the house
     * @para hasDiningRoom Whether the house has dining room, if it has, it is true, if it has not,  it is false.
     */
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.residents = new ArrayList<>();
        this.hasDiningRoom = hasDiningRoom;
    }
  
    /**
     * Check if the house has dining hall.
     * 
     * @return whether the house has dining Hall.
     */
    public boolean hasDiningRoom(){
        return hasDiningRoom;
    }
  
    /**
     * Returns the number of residents in the house.
     * 
     * @return the number of people living in the house.
     */
    public int nResidents(){
        return residents.size();
    }

    /**
     * Add new the residents to the house.
     * 
     * @param The name of the new resident.
     */
    public void moveIn(String name){
        if (residents.contains(name)){
            System.out.println("Resident already in the house.")
        } else {
            residents.add(name);  
        }
    }

    /**
     * Move residents out of the class.
     * 
     * @param The name of the removed resident.
     * @return The name of the removed resident or return null if the residents name is not found.
     * @throws IllegalArgumentException if the resident is not found in the list.
     */
    public String moveOut(String name){
        if(residents.contains(name)){
            residents.remove(name);
            return name;
        } else {
          throw new IllegalArgumentException("Resident not found in the house: " + name);
        }
    }
    
    /**
     * Check if the name is a resident of the house.
     * 
     * @param name name of the people that we want to check.
     * @return true if the person's name is in residetn list, else return false.
     */
    public boolean isResidents(String name){
        if(residents.contains(name)){
          return true;
        } else{
          return false;
        }
    }

    /**
     * Main method to show the functionality of the House class.
     */
    public static void main(String[] args){
        House myHouse = new House("My House", "Lower Elm Str", 2, true);
        System.out.println("You have built a house: 🏠");
        System.out.println("House Name: " + myHouse.getName());
        System.out.println("House Address: " + myHouse.getAddress());
        System.out.println("Number of Floors: " + myHouse.getFloors());
        System.out.println("Has Dining Room: " + myHouse.hasDiningRoom);
  
    }

}