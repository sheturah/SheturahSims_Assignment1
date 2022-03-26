

public class Student {
	public String firstName;
	public String lastName;
	public double gpa;
	public String major;
	public int age;
	
	
	public Student()
	{
		firstName = " ";
		lastName = " ";
		gpa = 0;
		major = " ";
		age = 0;
	
	}
	

	public Student(String firstName, String lastName, double gpa, String major, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.major = major;
		this.age = age;
	
	}
	
	public String getFirstName()
	{
		return firstName;
		
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
		
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public double getGpa()
	{
		return gpa;
		
	}
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public String getMajor()
	{
		return major;
		
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}


	public String toString()
	{
		String statement = (getFirstName() + " " + getLastName() +"\nMajor: " + getMajor() + "\nGPA: " + getGpa() + "\nAge: " + getAge());
		return statement;
	}

	
}
