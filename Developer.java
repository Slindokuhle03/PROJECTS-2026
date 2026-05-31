
package employee;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
class Developer extends Employee implements Payable {
	Scanner kb= new Scanner(System.in);
	DecimalFormat ft= new DecimalFormat("R##,###.00#");

        
       @Override
                
        ArrayList<String> addEmployeeName(ArrayList<String> name,String names){
            
                  name.add(names);

        
       /* System.out.print("Please enter employee name: ");
        names= kb.next();*/
        
     return name;
    }
        @Override
    ArrayList<String> addEmployeeID(ArrayList<String> ID,String id){
        /*String id;
        System.out.print("Please enter employee ID: ");
        id= kb.next();*/
            ID.add(id);
            
     return ID;       
    }
        @Override
        ArrayList<Double> addEmployeeSalary(ArrayList<Double> Salary,double salary){
             /*double salary ;     
        System.out.print("Please enter employee base Salary: ");
        salary= kb.nextDouble();*/
            Salary.add(salary);
            
        return Salary;
    }
            
        @Override
	void displayInfo(DecimalFormat ft,ArrayList names, ArrayList ID,ArrayList salary,ArrayList Salary, ArrayList id, ArrayList name, ArrayList role){
		
            // \u001B[1m turns bold ON, \u001B[0m turns bold OFF
            System.out.printf("\u001B[1m%-20s %-15s %-15s %-20s\u001B[0m%n", "Employee Name", "Employee ID", "Employee Salary", "Employee Role");

		for(int a=0;a<names.size(); a++){
                 
                    System.out.printf("%-20s %-15s %-15s %-20s%n",names.get(a),ID.get(a),ft.format(salary.get(a)),role.get(a));
                        
                    
                }
	}
	
        @Override
	 public void calculateSalary(Scanner kb,ArrayList ID,ArrayList<Double> Salary) {
            char answer;   
            int overTimeHours=0;   
            final int EXTRA_HOURS_RATE= 300;
            double total;
            boolean found= false;
            boolean ExtraHours= false;
                        
            System.out.println("Enter manager ID: ");
            String answerID=kb.next();
            
              for(int a=0; a<ID.size(); a++){
                           if(answerID.equals(ID.get(a))) {
                                found =true;
                            System.out.println("Are there any overtime hours that you did? YES/NO: ");
                            answer= kb.next().toUpperCase().charAt(0);

                                if(answer=='Y'){
                                    System.out.println("How many over hours done? : ");
                                    overTimeHours=kb.nextInt();

                                    total= Salary.get(a)+(overTimeHours*EXTRA_HOURS_RATE);
                                        
                                }else{
                                    total= Salary.get(a);
                                }
                                System.out.println("Total salary is: "+ total);
                                break;
                            }else if(a==ID.size()-1){
                                if(found == false){
                                    System.out.println("Employee not found");  
                                }
                            }
                        }
                    }

        
         
	
}