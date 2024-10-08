package paiementschoolsystem;
import java.util.ArrayList;
import java.util.List; 

public class Main {
	public static void main(String[] args) {
		teacher Lizzy =new teacher(1 ,"lizzy", 500);
		teacher Eya =new teacher(2 ,"eya", 500);
		teacher Sisam =new teacher(3 ,"Sisam", 500);
		teacher megan =new teacher(6 ,"megan", 900);
		
		
		List<teacher> teacherList = new ArrayList<>();
		teacherList.add(Eya);
		teacherList.add(Sisam);
		teacherList.add(Lizzy);
		teacherList.add(megan);		
		
		student Vladimir =new student(1 ,"Vladimir", 2);
		student Eugene = new student(2, "Eugene", 3);
		student Idy = new student(2, "Idy", 8);
		
		List<student>studentList = new ArrayList<>();
		studentList.add(Eugene);
		studentList.add(Idy);
		studentList.add(Vladimir);		
		
		school Eschool = new school(teacherList,studentList );
		Idy.payFees(10000);
		Eugene.payFees(20000);
		System.out.println("Eschool has earned "+Eschool.getTotalMoneyEarned() + "$");
		System.out.println("------Make ESCHOOl pay salary -------");
		Lizzy.receiveSalary(Lizzy.getSalary());
		Lizzy.receiveSalary(Lizzy.getSalary());
		System.out.println(Lizzy);
		Lizzy.receiveSalary(Lizzy.getSalary());
		System.out.println(teacherList);
		
		
	
		
		
		
		
	
		
	}

}
