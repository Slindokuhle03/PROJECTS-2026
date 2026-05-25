
package employee;
import java.util.ArrayList;
import java.util.Scanner;
class Developer extends Employee implements Payable {
	Scanner kb= new Scanner(System.in);
        
       @Override
                
        ArrayList addEmployeeName(ArrayList<String> name,String names){
            
                  name.add(names);

        
       /* System.out.print("Please enter employee name: ");
        names= kb.next();*/
        
     return name;
    }
        @Override
    ArrayList addEmployeeID(ArrayList<String> ID,String id){
        /*String id;
        System.out.print("Please enter employee ID: ");
        id= kb.next();*/
            ID.add(id);
            
     return ID;       
    }
        @Override
        ArrayList addEmployeeSalary(ArrayList<Double> Salary,double salary){
             /*double salary ;     
        System.out.print("Please enter employee base Salary: ");
        salary= kb.nextDouble();*/
            Salary.add(salary);
            
        return Salary;
    }
            
        @Override
	void displayInfo(ArrayList names, ArrayList ID,ArrayList salary,ArrayList Salary, ArrayList id, ArrayList name){
           
		for(int a=0;a<names.size(); a++){
                   /* System.out.print(name.get(a)+" ");
                    System.out.print(id.get(a)+" ");
                    System.out.print(Salary.get(a)+" ");*/


                    System.out.print(names.get(a)+" ");
                    System.out.print(ID.get(a)+" ");
                    System.out.print(salary.get(a)+"\n");
                        
                    
                }
	}
	
        @Override
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
