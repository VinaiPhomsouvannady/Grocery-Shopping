public class Foodunit extends Food
{
  public int numUnits;
  public Foodunit(String name, double price, int numUnits)
  {
    super(name,price);
    this.numUnits = numUnits;
  }
  public Foodunit()
  {
    super("", 0);
    numUnits = 0;
  }
  public void setunits(int units)
  {
    numUnits += units; 
  }
  public double cost()
  {
    return numUnits*price;
  }
  public void displayFoodInfo()
  {
    System.out.println(numUnits+" units of "+name+" ($"+cost()+")");
  }
  public void displayname()
  {
    System.out.print(name+":");
  }
  public void displayunit()
  {
    System.out.println(" each");
  }
  public double getunit()
  {
    return numUnits;
  }
}

//Class variable(s)
//public int numUnits //The number of units that a particular user has purchased
//Constructor:
//FoodUnit(String name, double price, int numUnits)
//FoodUnit() //by default, a FoodUnit object should have no name, a price of $0.00, and none should have been purchased
//Methods: 
//public double cost() //returns the product of the number of units purchased and the price per unit
//public void displayFoodInfo() //prints out the information about the Food object (name, price, number of units purchased, and total cost of the food obtained from the cost() method)

