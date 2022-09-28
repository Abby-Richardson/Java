import java.util.ArrayList;
public class Order {
    // attributes
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<String>items;


    // methods
public void displayOrder(){
    System.out.println("Name:" + this.name);
    System.out.println("Total:" + this.total);
    System.out.println("Ready:" + this.ready);
    System.out.println("Items:" + this.items);

}
}