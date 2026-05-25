
import java.util.Scanner;
import java.util.ArrayList;
public class MainAbstr {
    
  public static void main(String [] args){
    Scanner kb =new Scanner(System.in);
       ArrayList<String> name= new ArrayList<>();
       ArrayList<String> ID= new ArrayList<>();
       ArrayList<Double> salary= new ArrayList<>();
    //  String name="";
      //String ID="";
      double baseSalary=0;
	  int option;
	  char answer=' ';


	Developer dv= new Developer();
	Manager mn= new Manager();
        
           /* name= mn.addEmployeeName(kb);
            ID=mn.addEmployeeID(kb);
            salary=mn.addEmployeeSalary(kb);

        mn.displayInfo(name,ID,salary);*/
	//mn.calculateSalary(kb, baseSalary);
//dv.displayInfo();

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
				name= mn.addEmployeeName(kb);
				ID=mn.addEmployeeID(kb);
				salary=mn.addEmployeeSalary(kb);
								
				System.out.println("Add another employee? Yes/No");
			    answer= kb.next().toUpperCase().charAt(0);
			}while(answer=='Y');
		}
		
		if (option==2){
			
			do{
				name= dv.addEmployeeName(kb);
				ID.dv.addEmployeeID(kb);
				salary= dv.addEmployeeSalary(kb); 
				
				System.out.println("Add another employee? Yes/No");
			    answer= kb.next().toUpperCase().charAt(0);

			}while(answer=='Y');
		}
		if(option==3){
			mn.displayInfo(name,ID,salary);
			dv.displayInfo(name,ID,salary);
		}
		
	}while(option!=6);
	}  
}