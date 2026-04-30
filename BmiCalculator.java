import java.util.Scanner;
import java.util.Locale;
public class BmiCalculator{
	
	public static void main(String [] args){
		
		Scanner kb= new Scanner(System.in);
		kb.useLocale(Locale.US);
		
		char repeat=0;
		
		
		do{
			int unitChoice= getUnitChoice(kb);
			
			double weight= (unitChoice==1)? (getValidInput(kb, "Enter your weight in kilograms: ",10,150))
					: (getValidInput(kb, "Enter your weight in pounds", 22,1300));
			
			double height = (unitChoice==1)? (getValidInput(kb,"Enter your height in meter: ",0.5, 2.5))
					:(getValidInput(kb, "Enter your height in inches", 20,100));
					
			double bmi= calculateBMI(unitChoice, weight, height);
			
			System.out.println("Your BMI is "+ bmi);
			
		//	weightStatus(bmi);
			
			
			
			
		} while(repeat=='Y'|| repeat=='y');
	}
	
	public static int getUnitChoice(Scanner kb){
		int choice;
		
		while(true){
			
			System.out.println("Select a preferred unit: \n"
								+"1. Metric (kg, m)\n"
								+"2. Imperial (lbs, in)\n"
								+"Please select either option 1 or option 2");
								
			if(kb.hasNextInt())		{

				choice = kb.nextInt();
				if(choice ==1 || choice ==2){
					break;
				}else {
					System.out.println("Invalid choice. Please enter 1 or 2");
				
				} 
		
			
			}else {
					System.out.println("Invalid input. Please enter a number 1 or 2");
				}		
		}
		return choice;
	}
	
	public static double getValidInput(Scanner kb, String prompt, double min, double max){
		
		double value;
		
		while(true){
			
			System.out.println(prompt);
			
			if (kb.hasNextDouble()){

				value= kb.nextDouble();
				if (value>= min && value<= max){
					
					break;
				}else {
					System.out.printf
					("Please enter a value between %.if and %.if\n", min, max);
					
				} 
			}else {
					System.out.println("Invalid input. Please enter a value");
					kb.next();
				}			
		}
		return value;
	}
	
	public  static double calculateBMI(int unitChoice, double weight, double height){
		
		
		double totalBMI;
		if(unitChoice==1){
			
			totalBMI= weight/(height* height);
		} else{
			
			totalBMI=(703* weight)/(height/height);
		}
		return totalBMI;
	}
	public static void weightStatus(double bmi,double weight, double height, double totalBMI){
		//double ibm1= ibm;
	
		char ideal;
		if (bmi>=50){
				System.out.println("Your are obese.\nHealth risk warnings: Heart risk diseases\n\t\t\t\t\t\t");
			}	
		if(bmi>24 && bmi<50){
			
			System.out.println("You are over weight");
			
			//ideal weight 
			System.out.println("Would you like to know an ideal weight range? ");
			ideal= kb.next().charAt(0);
			ideal.toUpperCase();
			
			if(ideal=='Y'){
				totalBMI= weight/(height* height);
				double idealWeights= 24*(height*height);
				
				System.out.println("Your ideal weight is: "+ idealWeight);
				double looseWeights= weight-looseWeights;
				
			}
			
			} else if(bmi<18){
					
				System.out.println("You are under weight");
				} else if(bmi<=24 && bmi>=18){
					System.out.println("Your weight is normal");
					
				}
	}

	/*public static double idealWeight(double height, double bmi){
		
		if (bmi>50){
			
			
		}
		
	}*/
}