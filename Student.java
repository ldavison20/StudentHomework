
public class Student 
{
	private String name;
	private int gradeLevel;
	private double phoneNumber;
	private int gradYear;
	
	public Student(String n, int level, double p, int year )
	{
		name = n;
		gradeLevel = level;
		phoneNumber = p;
		gradYear = year;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGradeLevel()
	{
		return gradeLevel;
	}
	
	public double getPhoneNumber()
	{
		return phoneNumber;
	}
	public int getGradYear()
	{
		return gradYear;
	}
	public void nextGrade()
	{
		gradeLevel += 1;
	}
	public void setPhoneNumber()
	{
		phoneNumber = 0;
	}
}
