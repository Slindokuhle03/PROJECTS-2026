package employee;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {       
String name;
String ID;
double baseSalary;

abstract void displayInfo(ArrayList names, ArrayList ID,ArrayList salary);
abstract ArrayList addEmployeeName(Scanner kb);
abstract ArrayList addEmployeeID(Scanner kb);
abstract ArrayList addEmployeeSalary(Scanner kb);

 // TODO code application logic here
    
    
}
