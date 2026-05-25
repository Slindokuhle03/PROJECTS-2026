package employee;
import java.util.Scanner;
import java.util.ArrayList;
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
    void displayInfo(ArrayList names, ArrayList ID,ArrayList salary,ArrayList Salary, ArrayList id, ArrayList name) {
             
        for(int a=0;a<names.size(); a++){
            /*System.out.print(name.get(a)+" ");
            System.out.print(id.get(a)+" ");
            System.out.print(Salary.get(a)+" ");*/
            
            System.out.print(names.get(a)+" ");
            System.out.print(ID.get(a)+" ");
            System.out.print(salary.get(a)+"\n");
                        
                    }
                
        // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
   public void calculateSalary(Scanner kb, double salary) {
    char answer; 
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
        
    
    //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
   public static void main(String [] args){
       
       Scanner kb= new Scanner(System.in);
    

   }
}
