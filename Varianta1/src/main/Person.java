package main;

public class Person
/*
 * created by Edy
 */
{
	String fullName;
	String dateOfBirth;
	String gender;
	String phoneNumber;
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString()
	{
		String info = "";
		info+="Full names is :"+ fullName+ "\n";
		info+="Date of birth is: "+dateOfBirth+" \n" ;
		info+="Gender is : "+gender+ "\n";
		info+="Phone Number is :" +phoneNumber+ " \n";
		return info;
	}
	
	
}
