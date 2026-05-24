package employee;
import java.util.Scanner;
import java.util.ArrayList;
public class Manager extends Employee implements Payable{


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
    void displayInfo(ArrayList names, ArrayList ID,ArrayList salary) {
             
      
        for(int a=0;a<names.size(); a++){
                    System.out.println(names.get(a));

                    for(int z=0; z<ID.size(); z++){
                        System.out.println(salary.get(z));

                        for(int x=0; x<salary.size(); x++){
                            System.out.println(salary.get(x));
                        }
                    }
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
