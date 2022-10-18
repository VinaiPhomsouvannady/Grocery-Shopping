import java.util.*;
import java.text.*;
public class FoodShopping 
{ 
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    {
      DecimalFormat formatter = new DecimalFormat("0.00");
      ArrayList<Food> menu = new ArrayList<Food>();
      menu.add(new Foodunit("Chips", 2.00, 0));
      menu.add(new Foodunit("Pizza", 10.00, 0));
      menu.add(new Foodunit("Soda", 2.00, 0));
      menu.add(new Foodweight("Fried Chicken", 3.50, 0));
      menu.add(new Foodweight("Buffalo Wings", 3.50, 0));
      double total = 0;
      double alltotal = 0;
      ArrayList<Food> cart = new ArrayList<Food>();
      System.out.println("Welcome to Vinai's Favorites!\nBuy something!!:");
      for (int i = 0; i <menu.size(); i++)
      {
        menu.get(i).displayname();
        System.out.print(" $"+formatter.format(menu.get(i).price));
        menu.get(i).displayunit();
      }
      boolean repeat = true;
      while(repeat)
      {
        for (int i = 0; i <menu.size(); i++)
        {
          total+=menu.get(i).cost();
        }
        System.out.println("What would  you like to do?\n1. Add an item\n2. View Cart\n3. Checkout");
        int choice = input.nextInt();
        if (choice == 1)
        {
          System.out.println(" Which item do you want to add to your cart?");
          input.nextLine();
          String b = new String(input.nextLine());
          for (int i = 0; i <menu.size(); i++)
          {
            if(menu.get(i).name.compareToIgnoreCase(b)==0)
            {
              if(menu.get(i) instanceof Foodunit == true)
              {
                System.out.println("How many units of "+menu.get(i).name+" do you want to add to your cart?");
                int units = input.nextInt();
                while(units<0)
                {
                  units = input.nextInt();
                }
                ((Foodunit)menu.get(i)).setunits(units);
                System.out.println("Ok, "+units+" units of "+menu.get(i).name+" ($"+formatter.format(menu.get(i).price*units)+" total) successfully added to the cart.");
              }
              else
              {
                System.out.println("How many pounds of "+menu.get(i).name+" do you want to add to your cart?");
                double pounds = input.nextDouble();
                while(pounds<0)
                {
                  pounds = input.nextDouble();
                }
                ((Foodweight)menu.get(i)).setpounds(pounds);
                System.out.println("Ok, "+pounds+" pounds of "+menu.get(i).name+" ($"+formatter.format(menu.get(i).price*pounds)+" total) successfully added to the cart.");
              }
            }
          }
        }
        else if (choice == 2)
        {
          for (int i = 0; i <menu.size(); i++)
          {
            alltotal+=menu.get(i).cost();
          }
          System.out.println("Your cart has:");
          for (int i = 0; i <menu.size(); i++)
          {
            if(menu.get(i).getunit()>0)
            {
              menu.get(i).displayFoodInfo();
            }
          }
          System.out.println("Total cost of cart: $"+formatter.format(alltotal)+"");
        }
        else if (choice == 3)
        {
          repeat = false;
          System.out.println("Ok, your total cost is $"+formatter.format(alltotal)+". Thank you for shopping at Vinai's Groceries for all of your premiere food and beverage needs!");
        }
        else
        {
          System.out.println("Enter a valid input(1-3)");
          choice = input.nextInt(); 
        }
      }
    }
  }
}