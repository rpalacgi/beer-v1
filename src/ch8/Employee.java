/*
 * Created on Jul 26, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package ch8;

import ch5.Dog;

/**
 * @author Robbi
 */
public class Employee extends Person {
	private String ssn;
	private String empID;
	private Dog dog;
		
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getEmpID() {
		return empID;
	}
	
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	public Dog getDog() {
		return dog;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
