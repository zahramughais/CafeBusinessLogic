import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i = 1; i <=10; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for(int i = 0; i<prices.length;i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0;i<menuItems.size();i++){
            System.out.println(i+" "+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("print q to quit. \nPlease enter your name:");
        String userName = System.console().readLine();
        while (!userName.equals("q")){
            System.out.println(String.format("Hello, %s!", userName));
            System.out.println(String.format("There are %s people in front of you", customers.size()));
            customers.add(userName);
            System.out.println(customers);
            System.out.println("print q to quit. \nPlease enter your name:");
            userName = System.console().readLine();
            if (userName.equals("q")){
                break;
            }
    }
}

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for (int i =1; i <= maxQuantity; i++){
        System.out.println(i + " - $" + (price * i - (0.5 * (i-1))));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        } else {
            for (int i = 0 ; i < menuItems.size(); i++){
                System.out.println(i +" "+menuItems.get(i)+" -- $" + prices.get(i));
            }
            return true;
        }
    }

}
