import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        // initialize index 0 value as 1, terminate index length at 10, move through indexes by adding 1
        for (int i=1; i<=10; i++) {
            // add the current index to the previous as you move through the list
            sum +=i;
        }
        return sum;
    }


    public double getOrderTotal(double[] prices){
        double sum = 0;
        // move through array starting at index 0 and adding 1 index
        for (int i = 0; i < prices.length; i++) {
            // add all values in array together
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu (ArrayList<String>menuItems){
        for (String items: menuItems){
            int index = menuItems.indexOf(items);
            // concatinating integer and string
            System.out.format("%d %s \n", index, items);
        }
    }

    public String addCustomer(ArrayList<String>customers){
        int index;
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();

        // if statement for any string entry
        if (userName.contains(""));
            // add string to the customers ArrayList
            customers.add(userName);
            // assigning position and calling on userName entered
            index = customers.indexOf(userName);
            System.out.println("Hello, " + userName + "!");
        
            // concatinating and calling on integers in list
            System.out.format("There are %d orders in front of you ", index);
            System.out.println(customers);
            return "Something";
    }
}

