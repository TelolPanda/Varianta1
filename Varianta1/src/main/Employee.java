package main;

public class Employee 
/*
 * created by Andreea
 */

	{
	    String position;
	    String department;
	    String superior;
	    String employmentDate;
	    int salary;
	    
	    
		
	    public String getPosition() 
	    {
			return position;
		}
		public void setPosition(String position) 
		{
			this.position = position;
		}
		public String getDepartment() 
		{
			return department;
		}
		public void setDepartment(String department) 
		{
			this.department = department;
		}
		public String getSuperior() 
		{
			return superior;
		}
		public void setSuperior(String superior) 
		{
			this.superior = superior;
		}
		public String getEmploymentDate() 
		{
			return employmentDate;
		}
		public void setEmploymentDate(String employmentDate) 
		{
			this.employmentDate = employmentDate;
		}
		public int getSalary() 
	    {
			return salary;
		}
		public void setSalary(int salary) 
		{
			this.salary = salary;
		}

		@Override
		public String toString()
		{
			String text="";
			text+= "Departamentul este " + department + "\n";
			text+= "Pozitia este " + position + "\n";
			text+= "Superiorul este " + superior + "\n";
			text+= "Data angajarii este " + employmentDate + "\n";
			text+= "Salariul este " + salary + "\n";
			return text;
		}
	    
	}