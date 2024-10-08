package paiementschoolsystem;

public class student {
/*Create by Eugene Coulibaly 18.08.2024*/
/* this class is responsible for keep the track of student */
	
private int id ; 
private String name ; 
private int grade ;
private int feesPaid ;
private int feesTotal;


/*CONSTRUCTOR : Create a new student object by initializing the valuer */
/**
 * fees for every student would be 300 euro per years 
 * fees paid initially is 0 . 
 * @param id id for the student : unique . 
 * @param name name of the student . 
 * @param grade grade of the student . 
 */

public student (int id , String name , int grade ) {
	
	feesPaid =0; 
	this.id = id ; 
	this.name = name ;
	this.grade = grade ; 
	feesTotal = 300000;
	
	
}

// we are not going to alter Student's name and student's id . 
/**
 * Used to update the student's grade 
 * @param grade is the new grade of the student 
 */

public void setGrade(int grade) {
	this.grade = grade ; 
	
	
}

/**
 * add the fees to the fees paid 
 * the school is going to receive the funds. 
 * @param fees the fees that the student pays 
 */


public void payFees(int fees) {
	feesPaid+=fees ; 
	school.updateTotalMoneyEarned(feesPaid); 
	
}



/**
 * 
 * @return return the id 
 */

public int getId() {
	return id;
}



/**
 * 
 * @return return the name 
 */

public String getName() {
	return name;
}


/**
 * 
 * @return return the grade 
 */
public int getGrade() {
	return grade;
}


/**
 * 
 * @return return fees paid 
 */

public int getFeesPaid() {
	return feesPaid;
}



/**
 * 
 * @return return total fees 
 */

public int getFeesTotal() {
	return feesTotal;
}



/**
 * 
 * @return the remaining fees 
 */

public int getremainingFees() {
	return feesTotal-feesPaid;
	
}
// this is a way to represant a object 
@Override
public String toString() {
	return "student [name :" + name + ""
			+ ", grade :" + grade +
			", feesPaid :" + feesPaid +
			", feesTotal :" + feesTotal + "]";
}





}
