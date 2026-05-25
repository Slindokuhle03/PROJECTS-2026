package employee;

import java.util.Scanner;
import java.util.ArrayList;
public class MainAbstr {
    
  public static void main(String [] args){
    Scanner kb =new Scanner(System.in);
       ArrayList<String> name= new ArrayList<>();
       ArrayList<String> ID= new ArrayList<>();
       ArrayList<Double> salary= new ArrayList<>();
       //dev list
       ArrayList<String> nameDev= new ArrayList<>();
       ArrayList<String> IDDev= new ArrayList<>();
       ArrayList<Double> salaryDev= new ArrayList<>();
       //combined list
       ArrayList<String> employeeNames= new ArrayList<>(name);
       ArrayList<String> employeeID= new ArrayList<>(ID);
       ArrayList<Double> employeeSalary= new ArrayList<>(salary);

       Developer dv= new Developer();
       Manager mn= new Manager();
       
       //add to list
       name.add("Slindokuhle");
       name.add("Given");
       name.add("Tsepo");
       
       ID.add("123");
       ID.add("321");
       ID.add("213");
       
       salary.add(60_000.00);
       salary.add(45_000.00);
       salary.add(45_000.00);


        
        String searchName=" ";
        String searchID= " ";
        String name1=" ";
        String Id=" ";
        double salary1=0;
        double baseSalary=0;
	int option;
	char answer=' ';


	do{
		System.out.println("\t\t\tEmployee Management System");
		System.out.println("1. Add Manager\n2. Add Developer\n3. Display Employees\n4. Calculate Salary\n5. Search Emplyoyee\n6. Exist");
		option= kb.nextInt();
		
		if (option>6 || option<1){
			
			System.out.println("Invalid input, select option 1 to 6");
			
			System.out.println("\t\t\tEmployee Management System");
			System.out.println("1. Add Manager\n2. Add Developer\n3. Display Employees\n4. Calculate Salary\n5. Search Emplyoyee\n6. Exist");
			option= kb.nextInt();
		}
		if (option==1){
			do{
                            System.out.print("Please enter employee name: ");
                            name1= kb.next();
                            name= mn.addEmployeeName(name,name1);
                            
                            System.out.print("Please enter employee ID: ");
                            Id= kb.next();
                            ID=mn.addEmployeeID(ID,Id);
                            
                            System.out.print("Please enter employee base Salary: ");
                            salary1= kb.nextDouble();
                            salary=mn.addEmployeeSalary(salary,salary1);

                            System.out.println("Add another employee? Yes/No");
                            answer= kb.next().toUpperCase().charAt(0);
			}while(answer=='Y');
		}
		
		if (option==2){
                    
        	do{
                    System.out.print("Please enter employee name: ");
                            name1= kb.next();
                            name= dv.addEmployeeName(name,name1);
                            
                            System.out.print("Please enter employee ID: ");
                            Id= kb.next();
                            ID=dv.addEmployeeID(ID,Id);
                            
                            System.out.print("Please enter employee base Salary: ");
                            salary1= kb.nextDouble();
                            salary=dv.addEmployeeSalary(salary,salary1);


                    System.out.println("Add another employee? Yes/No");
                    answer= kb.next().toUpperCase().charAt(0);
                }while(answer=='Y');
        
                }
                    
				
		employeeNames.addAll(name);
                employeeID.addAll(ID);
                employeeSalary.addAll(salary);



		if(option==3){
			mn.displayInfo(name,ID,salary,employeeNames,employeeID,employeeSalary);
			//dv.displayInfo(name,ID,salary);
                       // System.out.println(employeeNames);
		}
		
                if (option==4){
                    mn.calculateSalary(kb, salary1);
                    dv.calculateSalary(kb, salary1);    
                }
                
                if (option==5){
                    int choice=0;
                    System.out.println("Search by name select 1, Search by ID select 2");
                    choice=kb.nextInt();
                    
                        
                    
                    
                    if(choice==1){
                        System.out.println("type search name: ");
                        searchName=kb.next();
                        for(int a=0; a<name.size(); a++){
                           if(searchName.equals(name.get(a))) {
                               System.out.println(name.get(a)+ID.get(a)+salary.get(a));

                           }else{
                            System.out.println("Employee not found");   
                           }
                        }
                    }
                    else{ 
                        System.out.println("type search ID: ");
                        searchID=kb.next();
                        for(int a=0; a<employeeID.size(); a++){
                           if(searchID.equals(ID.get(a))) {
                               System.out.println(name.get(a)+ID.get(a)+salary.get(a));

                           }else{
                            System.out.println("Employee not found");   
                           }
                        }
                    }
                }
	}while(option!=6);
	}  
}