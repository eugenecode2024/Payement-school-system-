package paiementschoolsystem;
import java.util.ArrayList;
import java.util.List;

/**
 * Many teachers , many students 
 * implement teachers and students using an ArrayList 
 * create by Eugene coulibaly 
 */

public class school {
	private List<teacher> Teachers ;
	private List<student> Student ; 
	private static int totalMoneyEarned ; 
	private static  int totalMoneySpent ;
	
	/**
	 * new School object is created 
	 * @param teachers list of teachers in the school 
	 * @param student list of student in the school 
	 */
	
	
	public school(List<teacher> teachers, List<student> student) {
		
		this.Teachers = teachers;
		this.Student = student;
		totalMoneyEarned= 0 ;
		totalMoneySpent = 0 ; 
	}
	/**
	 * 
	 * @return the list of teachers in the school . 
	 */

	public List<teacher> getTeachers() {
		return Teachers;
	}
	
	/**
	 * Add a teachers to the school . 
	 * @param teachers the teacher to be added 
	 */
	

	public void addTeachers(teacher teachers) {
		Teachers.add(teachers);
	}
	
	/**
	 * return the list of students . 
	 * @return
	 */

	public List<student> getStudent() {
		return Student;
	}
	
	/**
	 * add a student to the school. 
	 * @param student to be added 
	 */

	public void addStudent(student student) {
		Student.add(student);
	}

	/**
	 * 
	 * @return the total of money that has been earned 
	 */
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * 
	 * @param totalMoneyEarned to be updated 
	 */
	

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	
	/**
	 * 
	 * @return the Total of money that have bin spent by the school 
	 */

	public static  int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	/**
	 * update the total of money that has been spent 
	 * which is the salary given by the school to ti's teachers 
	 * @param totalMoneySpent
	 */

	public static void updateTotalMoneySpent(int MoneySpent) { 
		totalMoneyEarned -= MoneySpent ; 
		
	}
	@Override
	public String toString() {
		return "school [Teachers=" + Teachers + ", Student=" + Student + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
	
}