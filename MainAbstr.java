
package employee;
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

	Developer dv= new Developer();
	Manager mn= new Manager();
        
            name= mn.addEmployeeName(kb);
            ID=mn.addEmployeeID(kb);
            salary=mn.addEmployeeSalary(kb);

        mn.displayInfo(name,ID,salary);
	//mn.calculateSalary(kb, baseSalary);
//dv.displayInfo();
	
	}  
}
