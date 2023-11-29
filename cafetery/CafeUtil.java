import java.util.Date;
import java.util.ArrayList;
public class CafeUtil{


  public int getStreakGoal() {
      int sum = 0;
        for (int i = 0; i < 11; i++){
           sum = sum + i ;
        //System.out.println(sum);
    }
        return sum;
    }

    public int getStreakGoal(int value) {
      int sum = 0;
        for (int i = 0; i <= value; i++){
           sum = sum + i ;
        //System.out.println(sum);
    }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
      double sum1 = 0;
   for (int j = 0; j < lineItems.length; j++){
        sum1 = sum1 +lineItems[j];
   // System.out.println(lineItems[j]);
}
        return sum1;
    }
    
    void displayMenu(ArrayList<String> menuItems){
        for(int p = 0; p < menuItems.size(); p++){
        String name = menuItems.get(p);
        System.out.println(p + " : " + name);
        }
    }

   void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        // String name = customers.set(userName);

        //System.out.println(customers.size()); 
        System.out.println(customers); 
        System.out.println("Hello," + userName + "! There are " + (customers.size() -1) +" people ahead of you.");
         
    }



}
