package paiementschoolsystem;

/**
 * this class is create for keeping a track of teacher's id , name 
 * and salary 
 */

public class teacher {
	private int id ; 
	private String name ; 
	private int salary;
	private int salaryEarned ; 
	
	
	/**
	 * create a new teacher object by initializing the values 
	 * @param id for the teacher 
	 * @param name name of the teacher 
	 * @param salary salary of the teacher . 
	 */
	
	
	public teacher (int id , String name , int salary ) {
		this.id= id ; 
		this.name = name ;
		this.salary = salary ; 
		this.salaryEarned = 0 ; 
  
		
		
	}
	
	
	public int getID(int id) {
		return this.id ; 
	}
	
	
	public String getName() {
		return this.name ;
	}
	
	public int getSalary() {
		return salary ; 
	}
	
	
	/**
	 * set the salary . 
	 * @param salary 
	 */
	public void setSalary(int salary) {
		this.salary = salary ; 
		
		
	}
	
	/**
	 * adds to the salaryEarned  
	 * remove to the total money earned to Eschool 
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary ; 
		school.updateTotalMoneySpent(salary);
		
		
	}


	@Override
	public String toString() {
		return "teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + "]";
	}
	
	

}
