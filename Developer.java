
package employee;
import java.util.ArrayList;
import java.util.Scanner;
class Developer extends Employee implements Payable {
	Scanner kb= new Scanner(System.in);
        
       @Override
                
        ArrayList addEmployeeName(Scanner kb){
       ArrayList<String> name= new ArrayList<>();
        String names;
      
        
        System.out.print("Please enter employee name: ");
        names= kb.next();
            name.add(names);
        
     return name;
    }
        @Override
    ArrayList addEmployeeID(Scanner kb){
       ArrayList<String> ID= new ArrayList<>();
        String id;
        System.out.print("Please enter employee ID: ");
        id= kb.next();
            ID.add(id);
            
     return ID;       
    }
        @Override
        ArrayList addEmployeeSalary(Scanner kb){
            ArrayList<Double> Salary= new ArrayList<>();
             double salary ;     
        System.out.print("Please enter employee base Salary: ");
        salary= kb.nextDouble();
            Salary.add(salary);
            
        return Salary;
    }
            
        @Override
	void displayInfo(ArrayList names, ArrayList ID,ArrayList salary){
           
		for(int a=0;a<names.size(); a++){
                    System.out.println(names.get(a));

                    for(int z=0; z<ID.size(); z++){
                        System.out.println(salary.get(z));

                        for(int x=0; x<salary.size(); x++){
                            System.out.println(salary.get(x));
                        }
                    }
                }
	}
	
	 public void calculateSalary(Scanner kb, double salary) {
    char answer;   
    int overTimeHours=0;   
    final int EXTRA_HOURS_RATE= 300;
    double total;
    
        System.out.println("Are there any overtime hours that you did? YES/NO: ");
        answer= kb.next().toUpperCase().charAt(0);
        
        if(answer=='Y'){
            total= salary+(overTimeHours*EXTRA_HOURS_RATE);
        }else{
            total= salary;
        }
         }	
	
}
