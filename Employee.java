package employee;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {       
String name;
String ID;
double baseSalary;

abstract void displayInfo(DecimalFormat ft,ArrayList names, ArrayList ID,ArrayList salary,ArrayList Salary, ArrayList id, ArrayList name,ArrayList role);
abstract ArrayList addEmployeeName(ArrayList<String> names ,String name);
abstract ArrayList addEmployeeID(ArrayList<String> Id,String ID);
abstract ArrayList addEmployeeSalary(ArrayList<Double> Salary, double salary);

 // TODO code application logic here
    
    
}