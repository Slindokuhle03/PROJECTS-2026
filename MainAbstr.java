package employee;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
public class MainAbstr {
    
  public static void main(String [] args) {
    Scanner kb =new Scanner(System.in);
	DecimalFormat ft= new DecimalFormat("R##,###.00#");

       ArrayList<String> name= new ArrayList<>();
       ArrayList<String> ID= new ArrayList<>();
       ArrayList<String> Role= new ArrayList<>();
       ArrayList<Double> salary= new ArrayList<>();
       //dev list
       /*ArrayList<String> nameDev= new ArrayList<>();
       ArrayList<String> IDDev= new ArrayList<>();
       ArrayList<String> RoleDev= new ArrayList<>();
       ArrayList<Double> salaryDev= new ArrayList<>();*/
       
       //combined list
       ArrayList<String> employeeNames= new ArrayList<>(name);
       ArrayList<String> employeeID= new ArrayList<>(ID);
       ArrayList<Double> employeeSalary= new ArrayList<>(salary);
       ArrayList<String> employeeRole= new ArrayList<>(Role);
       

       Developer dv= new Developer();
       Manager mn= new Manager();
       
       //add to list
       name.add("Slindokuhle");
       name.add("Given");
       name.add("Tsepo");
       
       ID.add("123");
       ID.add("321");
       ID.add("213");
       
       Role.add("Developer");
       Role.add("Developer");
       Role.add("Manager");
       
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
		int choice;

		char answer=' ';
		boolean found= false;



	do{
		System.out.println("\n\t\t\tEmployee Management System");
		System.out.println("1. Add Manager\n2. Add Developer\n3. Display Employees\n4. Calculate Salary\n5. Search Employee\n6. Exist");
		option= kb.nextInt();
		
		if (option>6 || option<1){
			
			System.out.println("Invalid input, select option 1 to 6");
			
			System.out.println("\n\t\t\tEmployee Management System");
			System.out.println("1. Add Manager\n2. Add Developer\n3. Display Employees\n4. Calculate Salary\n5. Search Employee\n6. Exist");
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
                            
                            Role.add("Manager");
                            
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
                            
                            Role.add("Developer");

                    System.out.println("Add another employee? Yes/No");
                    answer= kb.next().toUpperCase().charAt(0);
                }while(answer=='Y');
        
                }
                    
				
		employeeNames.addAll(name);
                employeeID.addAll(ID);
                employeeSalary.addAll(salary);
                employeeRole.addAll(Role);


		if(option==3){
			mn.displayInfo(ft,name,ID,salary,employeeNames,employeeID,employeeSalary,Role);
			//dv.displayInfo(name,ID,salary);
                       // System.out.println(employeeNames);
		}
		
                if (option==4){
                    int choice1=0;
                    System.out.println("Calculate salary for Manager select 1:\nCalculate salary for Developer select 2: ");
                    choice1= kb.nextInt();
					
                        if(choice1==1){
                            mn.calculateSalary(kb,employeeID,employeeSalary);
                        }
                        else{
                            dv.calculateSalary(kb,employeeID,employeeSalary);    
                        }
                }
                
                if (option==5){
                    System.out.println("Search by name select 1, Search by ID select 2");
                    choice=kb.nextInt();
                    
                        while(choice<1 || choice>2){
                            System.out.println("Invalid input");

                            System.out.println("Search by name select 1, Search by ID select 2");
                            choice=kb.nextInt();
                            }
                    
                    
                    if(choice==1){
                        
                     boolean valid = false;

                        while(valid == false){

                            valid = true;

                            System.out.println("Type search name: ");
                            searchName = kb.next();

                            for(int a = 0; a < searchName.length(); a++){

                                if(Character.isDigit(searchName.charAt(a))){

                                    System.out.println("Invalid name");

                                    valid = false;

                                    break;
                                }
                            }
                        }
                        /* while(Character.isDigit(searchName.charAt(0))){
                            System.out.println("Invalid name");
                            
                            System.out.println("Type search name: ");
                            searchName=kb.next();
                        }*/
						
                        for(int a=0; a<name.size(); a++){
                           if(searchName.equalsIgnoreCase(employeeNames.get(a))) {
                                System.out.printf("%-20s %-15s %15s%n","Employee Name","Employee ID","Employee Salary");
                                System.out.printf("%-20s %-15s %15s%n",employeeNames.get(a),employeeID.get(a),ft.format(employeeSalary.get(a)));                                found= true;
                                 break;
                           }else if(a==employeeID.size()-1){
                            System.out.println("Employee not found");   
                           }
                        }
                    }
                    else{ 
                        System.out.println("Type search ID: ");
                        searchID=kb.next();
				
                        while(searchID.length()>3 ||searchID.length()<3 ){
                            System.out.println("Invalid ID");
                            
                            System.out.println("Type search ID: ");
                            searchID=kb.next();
                        }
                        
                        for(int a=0; a<employeeID.size(); a++){
                           if(searchID.equals(employeeID.get(a))) {
                                System.out.printf("%-20s %-15s %15s%n","Employee Name","Employee ID","Employee Salary");

                                System.out.printf("%-20s %-15s %15s%n",employeeNames.get(a),employeeID.get(a),ft.format(employeeSalary.get(a)));
                                    found =true;
                                    break;
                           }else if(a==employeeID.size()-1){
                                if(found == false){
                                    System.out.println("Employee not found");  
                                }
                            }
                        }
                    }
                }
	}while(option!=6);
	}  
}