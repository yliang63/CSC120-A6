/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Map;

public class Library {
  private Hashtable<String, Boolean> collection;

    public Library() {
      super();
      this.collection = new Hashtable<>();
    }

    public void addTitle(String title){
      collection.put(title,true);
    }
  
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }

    public void checkOut(String title){
      if(collection.containsKey(title)){
        collection.put(title,false);
      }
      else{
        System.out.println("Title is not found in the collection.");
      }
    }

    public void returnBook(String title){
      if(collection.containsKey(title)){
        collection.put(title,true);
      }
      else{
        System.out.println("Title is not found in the collection.");
      }
    }
    

    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }
    
    public boolean isAvailable(String title){
      return collection.getOrDefault(title,false);
    }

    public void printCollection(){
      System.out.println("Library Collection");
      for(Map.Entry<String, Boolean> entry:collection.entrySet()){
        String status = entry.getValue()?"Available":"Checked out";
        System.out.println(entry.getKey()+"-"+status);
      }
    }
    public static void main(String[] args) {
      System.out.println("You have built a library: 📖");
      Library library = new Library();
      library.addTitle("To Kill a Mocking Bird");
      library.addTitle("Frankly in Love");
      library.checkOut("Frankly in Love");
      library.printCollection();
      library.returnBook("Frankly in Love");
      System.out.println(library.isAvailable("Gone with the wind"));


    }
  
  }