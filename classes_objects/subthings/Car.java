package subthings;

public class Car
{
  String brand;
  int year;
  
  public Car(String brand, int year)
  {
    this.brand = brand;
    this.year = year;
  }


  public void drive()
  {
    System.out.println("I drive a " + this.brand);
  }
}
