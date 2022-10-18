public class Foodweight extends Food
{
  public double weight; 
  Foodweight(String name, double price, double weight)
  {
    super(name,price);
    this.weight = weight;
  }
  public Foodweight()
  {
    super("", 0);
    weight = 0;
  }
  public double cost()
  {
    return weight*price;
  }
  public void setpounds(double weight)
  {
    this.weight += weight; 
  }
  public void displayFoodInfo()
  {
    System.out.println(weight+" pound(s) of "+name+" ($"+cost()+")");
  }
  public void displayname()
  {
    System.out.print(name+":");
  }
  public void displayunit()
  {
    System.out.println(" per pound");
  }
  public double getunit()
  {
    return weight;
  }
}

//Class variable(s)
//public double weight  //The weight of the particular product that the user has purchased (in pounds)
//Constructor:
//FoodWeight(String name, double price, double weight)
//FoodUnit() //by default, a FoodUnit object should have no name, a price of $0.00, and none should be purchased
//Methods: 
//public double cost() //returns the product of the weight of the product and the price per pound
//public void displayFoodInfo() //prints out the information about the Food object (name, price, weight of the product purchased, and total cost of the food obtained from the cost() method)
