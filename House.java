/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
  }
  
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  
  public int nResidents(){
    return residents.size();
  }

  public void moveIn(String name){
    residents.add(name);
  }

  public String moveOut(String name){
    if(residents.contains(name)){
      residents.remove(name);
      return name;
    }
    else{
      return null;
    }
  }

  public static void main(String[] args){
    House myHouse = new House("My House", "123 Main St", 2, true);
    System.out.println("You have built a house: 🏠");
    System.out.println("House Name: " + myHouse.getName());
    System.out.println("House Address: " + myHouse.getAddress());
    System.out.println("Number of Floors: " + myHouse.getFloors());
    System.out.println("Has Dining Room: " + myHouse.hasDiningRoom);
  
  }

}