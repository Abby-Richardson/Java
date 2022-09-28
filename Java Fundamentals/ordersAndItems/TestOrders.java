import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item ();
        item1.name = "Drip Coffee";
        item1.price = 2.5;

        Item item2 = new Item ();
        item2.name = "Latte";
        item2.price = 3.75;

        Item item3 = new Item ();
        item3.name = "Mocha";
        item3.price = 4.25;

        Item item4 = new Item ();
        item4.name = "Cappuccino";
        item4.price = 4.5;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = item3.price;
        order1.ready = false;
        order1.items = new ArrayList<String>();
        order1.items.add(item3.name);
        

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = item1.price;
        order2.ready = false;
        order2.items = new ArrayList<String>();
        order2.items.add(item1.name);
        

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = (item3.price + item4.price + item2.price + item2.price);
        order3.ready = false;
        order3.items = new ArrayList<String>();
        order3.items.add(item3.name + ", " + item4.name);


        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = (item1.price + item2.price);
        order4.ready = false;
        order4.items = new ArrayList<String>();
        order4.items.add(item2.name + ", " + item1.name);

    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        order1.ready = true;
        order3.items.add(item2.name);
        order3.items.add(item2.name);
        order2.ready = true;

        order1.displayOrder();
        System.out.println("************************************");
        order2.displayOrder();
        System.out.println("************************************");
        order3.displayOrder();
        System.out.println("************************************");
        order4.displayOrder();
        System.out.println("************************************");

    }
}