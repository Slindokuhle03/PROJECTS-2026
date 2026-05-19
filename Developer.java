class Developer extends Employee implements Payable {
	
	void displayInfo(){
		
		System.out.println("Given");
		
	}
	
	void calculateSalary(){
		
		
	}
	
	public static void main(String [] args){
	Developer dv= new Developer();
	
	dv.displayInfo();
	
	}
}