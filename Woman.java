import java.util.Scanner;

public class Woman
{
  String name;
  int age;


  Woman(String name, int age)
  {
    this.name = name;
    this.age = age;
  }


  static Woman createWoman()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    System.out.print("Enter age: ");
    int age = scanner.nextInt();

    return new Woman(name, age);
  }


  public static void main(String[] args)
  {
    Woman woman = Woman.createWoman();
    System.out.println(woman.name);
    System.out.println(woman.age);
  }
}
