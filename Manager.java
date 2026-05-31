package employee;

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
    void displayInfo(DecimalFormat ft,ArrayList names, ArrayList ID,ArrayList salary,ArrayList Salary, ArrayList id, ArrayList name,ArrayList role) {
        
// \u001B[1m turns bold ON, \u001B[0m turns bold OFF
    System.out.printf("\u001B[1m%-20s %-15s %-15s %-20s\u001B[0m%n", "Employee Name", "Employee ID", "Employee Salary", "Employee Role");
					
        for(int a=0;a<names.size(); a++){
							
            System.out.printf("%-20s %-15s %-15s %-20s%n",names.get(a),ID.get(a),ft.format(salary.get(a)),role.get(a));
            //System.out.print(ID.get(a));
            //System.out.print(salary.get(a)+"\n");
                        
                    }
                
        // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
   public void calculateSalary(Scanner kb, ArrayList ID,ArrayList<Double> Salary) {
    char answer; 
    boolean found= false;
    int overTimeHours=0;   
    final int EXTRA_HOURS_RATE= 300;    
    int a;
    int completedProject=0;   
    final int PROJECT_BONUS= 3500;
    double total;
    
        System.out.println("Enter manager ID: ");
        String answerID=kb.next();
        
        for(int z=0; z<ID.size(); z++){
                           if(answerID.equals(ID.get(z))) {
                                found =true;
                                System.out.println("Are there any completed project YES/NO: ");
                                answer= kb.next().toUpperCase().charAt(0);
        
                                    if(answer=='Y'){
                                        System.out.println("How many completed projects: ");
                                        a= kb.nextInt();

                                        total= Salary.get(z)+(a*PROJECT_BONUS);
                                        break;
                                    }else{
                                        total= Salary.get(z);
                                    }    
                                            System.out.println("Extra hours completed: ");
                                            overTimeHours= kb.nextInt();
                                            total+= overTimeHours*EXTRA_HOURS_RATE;

                              System.out.println("Total pay is: "+ total);

                        }
       
    
    //throw new UnsupportedOperationException("Not supported yet."); 
    }
   }
    
   public static void main(String [] args){
       
       Scanner kb= new Scanner(System.in);
	   DecimalFormat ft= new DecimalFormat("R##,###.00#");

   }
}