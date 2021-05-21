# Project1
employee details
 In This Emplyoee program with a business logic and real entity. In this business logic we have some properties like name, salary, age and designation. In this business logic first we have taken abstract class and declare the all varaibles and methods varaibles like name,designation, salary,age and methods are Emplyoee,display,salaryraise. In these we can read the all the name,age,salary desiganation, and by using the methods we can implement the our project.In these first we have take the abstract class and all properties like varaibles such as
 
    String name,desig;
    int age,sal;
   
   Next we have employee method in this employee(); we can enter the name and age of the the emplyoee.
    
      public Employee()
        {
           System.out.println("Enter Name:");
           name=sc.next();
           System.out.println("Enter Age:");
           age=sc.nextInt();
          }

By using display method we have displayed what ever values we enter those are display on the screen like name,salary,age,desgnation

     public void display()
     {
      System.out.println("\nName :"+name);
      System.out.println("Age    :"+age);
      System.out.println("Salary :"+sal);
      System.out.println("Designation:"+desig);
      }
      
 In these business logic we have the emplyoees like clerk, Programmer, Manager.
once we are declare the final class in this business logic we can not the inherited other class and class clerk extends from employee class what ever properties are in employee class those properties are inherted in to the clerk class.In these we have one more method that is employee raise salary purpose.

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
      
  In the similar way we do for Programmer and manager.
  
  In this Progam next display on the screen create,diplay,raisesalary and exit based our choice we have to enter the numbers and it contain switch loop and based on our choice     we have enter the values emplyoees.
  
     do
             {
                System.out.println("\n 1.create \n 2.display \n 3.RaiseSalary\n 4.Exit\n Enter your choice");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:   do
                                {
                                  System.out.println("\n 1.Clerk \n 2.Manager \n 3.Programmer\n 4.Exit\n Enter your choice");
                                  c2=sc.nextInt();
                                  switch(c2)
                                  {
                                    case 1:e[i]=new clerk();
                                            i++;
                                            break;
                                    case 2:e[i]=new Programmer();
                                            i++;
                                            break;
                                    case 3:e[i]=new Manager();
                                            i++;
                                            break;
                  }
             }while(c2!=4);
       break;
    case 2: try
            {
               for(Employee x:e)
               {
                  if(x!=null)
                    x.display();
                }
             }catch(Exception ex){
                  System.out.println("No Records are Present.....!");
             }
           break;
        case 3: try
                {
                  for(Employee x:e)
                   {
                    if(x!=null)
                      x.raise();
                    }
                 }
                   catch (Exception ex)
                  {
                    System.out.println("No Records Present....");
                  }
              break;
           case 4: System.out.println("Exiting.....");
               break;
           default: System.out.println("Invalid choice....");
         }
       }while(ch>0 && ch<4);
    }
 }
  
  Based on our choice output will be displayed.
  
  output :
  
    1.create
    2.display
    3.RaiseSalary
    4.Exit
    Enter your choice
    1

    1.Clerk
    2.Manager
    3.Programmer
     4.Exit
    Enter your choice
     1
    Enter Name:
    navya
    Enter Age:
    21

    1.Clerk
    2.Manager
    3.Programmer
    4.Exit
    Enter your choice
    2
    Enter Name:
    kavya
    Enter Age:
    23

    1.Clerk
    2.Manager
    3.Programmer
    4.Exit
    Enter your choice
     4

    1.create
    2.display
    3.RaiseSalary
    4.Exit
    Enter your choice
    2

    Name :navya
    Age    :21
    Salary :20000
    Designation:clerk

    Name :kavya
    Age    :23
    Salary :25000
    Designation:Programmer

    1.create
    2.display
    3.RaiseSalary
    4.Exit
    Enter your choice
    3

    Salary Raised....

    Salary Raised....

     1.create
     2.display
    3.RaiseSalary
    4.Exit
    Enter your choice
     4
     Exiting.....

  
