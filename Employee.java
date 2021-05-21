import java.util.Scanner;
abstract class Employee
{
    String name,desig;
    int age,sal;
     
    Scanner sc=new Scanner(System.in);
    
    public Employee()
    {
     System.out.println("Enter Name:");
     name=sc.next();
     System.out.println("Enter Age:");
     age=sc.nextInt();
     }
     public void display()
     {
      System.out.println("\nName :"+name);
      System.out.println("Age    :"+age);
      System.out.println("Salary :"+sal);
      System.out.println("Designation:"+desig);
      }
      public abstract void raise();
    }
    final class clerk extends Employee
    {
        public clerk()
        {
                 sal=20000;
                 desig="clerk";
         }
     
          public void raise()
          {
           sal+=15000;
           System.out.println("\nSalary Raised....");
           }
      }
      final class Programmer extends Employee
    {
        public Programmer()
        {
                 sal=25000;
                 desig="Programmer";
         }
     
          public void raise()
         {
           sal+=10000;
           System.out.println("\nSalary Raised....");
          }
      }
       final class Manager extends Employee
      {
        public Manager()
        {
                 sal=30000;
                 desig="Manager";
         }
     
          public void raise()
         {
           sal+=35000;
           System.out.println("\nSalary Raised....");
          }
      }