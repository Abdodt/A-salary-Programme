/**
 * In this Program we show the features of Inheritance.
 * This is a Multilevel inheritance.
 * salary is where we will call the main function
 * employee is the super class
 */
import java.io.IOException;
import java.util.Scanner;

class employee
    {
     String name,designation,department;
     int id;
    
    void read()  //Input the elements.
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of employee:");
        id = sc.nextInt();
        System.out.print("Enter the name of the employee:");
        name = sc.next();
        System.out.print("Enter the department of the employee:");
        department = sc.next();
        System.out.print("Enter the designation of the employee:");
        designation = sc.next();
    }
    
     void display()
     {
        System.out.println("Id          :"+id);
        System.out.println("Name        :"+name);
        System.out.println("Department  :"+department);
        System.out.println("Designation :"+designation);
     }

 }

public class salary extends employee   
{
    double Basic_pay,HRA =1250; 
     void income()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Basic pay of the Employee:");
        Basic_pay = s.nextDouble();
    
    }

     void display()
    {
                            // we can use  super.display();  to bring in elements class employee so they will also be shown.
                          //Another method would be to use different method names for different functions.
        System.out.println("The basic pay is "+Basic_pay); 
        System.out.println("HRA is "+HRA );
        System.out.println("DA is "+(Basic_pay* 1.1));
        System.out.println("Elevance is "+(Basic_pay * .35));
        System.out.println("The net_salary is"+(12 * Basic_pay));

    }

    public static void main(String[] args) {
        employee emp = new employee(); // We created an object
        salary sa = new salary();  //create object for methods because they are not static.
        emp.read();
        sa.income();
        emp.display();
        sa.display();
        
    }

}

