
public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
    
    public Cafe(String name, String address, int nFloors,int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
  }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (size <= nCoffeeOunces && nSugarPackets <= this.nSugarPackets && nCreams <= this.nCreams && nCups > 0) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups--;
            System.out.println("Enjoy your coffee!");
        } else {
            System.out.println("Sorry, we are out of stock for the requested coffee.");
            restock(10, 10, 20, 30); // Restock with default values
        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("Inventory has been restocked.");
    }

    public static void main(String[] args) {
        System.out.println("You have built a cafe: ☕");
        Cafe cafe = new Cafe("Cafe", "123 Main St", 3, 20, 20, 40, 50);
        cafe.sellCoffee(15, 3, 2); 
        cafe.sellCoffee(10, 5, 4);
    }
}
