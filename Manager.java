
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Manager extends Employee implements Payable{


    @Override
    ArrayList<String> addEmployeeName(ArrayList<String> name, String names){
       name.add(names);
        
     return name;
    }
    @Override
    ArrayList<String> addEmployeeID(ArrayList<String> ID, String id){
        ID.add(id);

       /* String id;
        System.out.print("Please enter employee ID: ");
        id= kb.next();*/
            
     return ID;       
    }
    @Override
        ArrayList<Double> addEmployeeSalary(ArrayList<Double> Salary, double salary){
           
            /*double salary ;     
        System.out.print("Please enter employee base Salary: ");
        salary= kb.nextDouble();*/
            Salary.add(salary);
            
        return Salary;
    }
    @Override
    void displayInfo(DecimalFormat ft,ArrayList names, ArrayList ID,ArrayList salary,ArrayList Salary, ArrayList id, ArrayList name) {
        
		System.out.printf("%-20s %-15s %15s%n","Employee Name","Employee ID","Employee Salary");
					
        for(int a=0;a<names.size(); a++){
							
            System.out.printf("%-20s %-15s %15s%n",names.get(a),ID.get(a),ft.format(salary.get(a)));
            //System.out.print(ID.get(a));
            //System.out.print(salary.get(a)+"\n");
                        
                    }
                
        // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
   public void calculateSalary(Scanner kb, double salary) {
    char answer; 
	int overTimeHours=0;   
    final int EXTRA_HOURS_RATE= 300;    
	int a;
    int completedProject=0;   
    final int PROJECT_BONUS= 3500;
    double total;
    
        System.out.println("Are there any completed project YES/NO: ");
        answer= kb.next().toUpperCase().charAt(0);
        
        if(answer=='Y'){
            System.out.println("How many completed projects: ");
            a= kb.nextInt();

            total= salary+(a*PROJECT_BONUS);
        }else{
            total= salary;
        }    
		System.out.println("Extra hours completed: ");
		overTimeHours= kb.nextInt();
		total+= overTimeHours*EXTRA_HOURS_RATE;
  
  System.out.println("Total pay is: "+ total);
        
    
    //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
   public static void main(String [] args){
       
       Scanner kb= new Scanner(System.in);
	   DecimalFormat ft= new DecimalFormat("R##,###.00#");

   }
}
