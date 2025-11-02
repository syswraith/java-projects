import java.util.Scanner;


public class Student
{

  String name;
  float marks;
  int rollno;

  Student(String name, float marks, int rollno)
  {
    this.name = name;
    this.marks = marks;
    this.rollno = rollno;
  }


  static Student InputDetails()
  {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    float marks = scanner.nextFloat();
    int rollno = scanner.nextInt();
    return new Student(name, marks, rollno);
  }

  public static void main(String[] args)
  {
    Student student1 = Student.InputDetails();
    Student student2 = Student.InputDetails();
    System.out.println(student1.name);
    System.out.println(student1.marks);
    System.out.println(student1.rollno);
    System.out.println(student2.name);
    System.out.println(student2.marks);
    System.out.println(student2.rollno);
  }
}
