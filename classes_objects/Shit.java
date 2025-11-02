
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

public class Shit
{
  public static void main(String[] args)
  {
    Car car = new Car("Ferrari", 1991);
    car.drive();
  }
}
