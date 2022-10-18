public abstract class Food
{
  public String name;  
  protected double price; 
  
  public Food(String name, double price)
  {
    this.name = name;
    this.price = price;
  }
  public Food()
  {
    name = "";
    price = 0;
  }
  
  public abstract double cost();
  protected void displayInfo()
  {
  }
  public abstract void displayname();
  public abstract void displayunit();
  public abstract void displayFoodInfo();
  public abstract double getunit();
  
}


//Instance Variables
//String name
//double price //This variable will represent the price per unit or per pound, depending on the specific child class that inherits it.
//Constructor:
//Food(String name, double price)
//Food() //by default, a Food object should have no name and a price of $0.00
//Methods: 
//public abstract double cost()
//public abstract 
//protected void displayInfo() //displays the name of the Food object and its price per unit or pound (this will depend on the subclass that extends it)
