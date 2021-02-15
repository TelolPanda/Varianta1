package main;

public class Employee 

	{
	    String position;
	    String department;
	    String superior;
	    String employmentDate;
	    int salary;
	    
	    
		public String getFullName() 
	    {
	        return position;
	    }
	    public void setFullName(String fullName) 
	    {
	        this.position = fullName;
	    }
	    public String getDateOfBirth() 
	    {
	        return department;
	    }
	    public void setDateOfBirth(String dateOfBirth) 
	    {
	        this.department = dateOfBirth;
	    }
	    public String getGender() 
	    {
	        return superior;
	    }
	    public void setGender(String gender) 
	    {
	        this.superior = gender;
	    }
	    public String getPhoneNumber() 
	    {
	        return employmentDate;
	    }
	    public void setPhoneNumber(String phoneNumber) 
	    {
	        this.employmentDate = phoneNumber;
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