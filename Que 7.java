package code;

//Write a java program to get details from a student and display it. Here not only the students studying in college, the school students also have common details such as Name, Gender, Age, Id Number and CGPA. So these details can be in one base class and other details such as year in which they are studying and their department can be in subclass. The subclass can extends to the base class and use the details in base class. Implement the inheritance concept.
//Create two class namely Main,Student and CollegeStudent.
//
//Here Student is the base class and CollegeStudent is the subclass.
//
//The student of every departments has common details such as name, gender, age, idNum and cgpa. These details should be declared as private variables in Student class and this class should include appropriate getter and setter methods.
//
//The details such as department and year they are studying differs. These details should be declared as private variables in CollegeStudent class and this class should include appropriate getter and setter methods.
//
//Create a constructor in CollegeStudent class. The constructor will use seven parameters to initialize myName, myAge, myGender, myIdNum, myGPA, year, and major. Use the super reference to use the constructor in the Student superclass to initialize the inherited values.
//
//Write the toString() method for the CollegeStudent class. Use the super reference to do the things already done by the superclass.
//
//The first input refers to name of the student.
//
//The second input refers to age of the student.
//
//The third input refers to gender of the student.
//
//The fourth input refers to student ID.
//
//The fifth input refers to major of the student.
//
//The sixth input refers to student CGPA.
//
//The last input refers to year of studying of the student.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main
{
    public static void main(String[] a) throws IOException
    {
        //Your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		String gender;
		Long idNum;
		Double cgpa;
		Integer year;
		String major;
		name = br.readLine();
		age = Integer.parseInt(br.readLine());
		gender = br.readLine();
		idNum = Long.parseLong(br.readLine());
		major = br.readLine();
		cgpa = Double.parseDouble(br.readLine());
		year = Integer.parseInt(br.readLine());
		CollegeStudent cs = new CollegeStudent(name, age, gender, idNum, cgpa, year, major);
		System.out.println("The Student Details is ");
		System.out.println(cs.toString());
    }
}

 class CollegeStudent extends Student 
{
	private String Department,Major;
	private int Year;
	
	public CollegeStudent(String myName,int myAge,String myGender,long myIdNum,Double myGPA,int year,String major)
	{
		super(myName, myAge,myGender,myIdNum,myGPA);
	
		this.Year=year;
		this.Major=major;
	}
	public String getDeparment()
	{
		return Department;
	}
	public void setDepartment(String department)
	{
		Department=department;
	}
	public int getYear()
	{
		return Year;
	}
	public void setYear(int year)
	{
		Year=year;
	}
	public String getMajor()
	{
		return Major;
	}
	public void setMajor(String major)
	{
		Major=major;
	}
	public String toString()
	{
		return "ID : "+getId()+"\nName : "+getName()+"\nAge : "+getAge()+"\nGender : "+getGender()+"\nMajor : "+getMajor()+"\nCGPA : "+getCgpa()+"\nYear : "+getYear();
	}
}

class Student
{
	private String Name,Gender;
	private int Age;
	private long Id;
	private double Cgpa;
	
	public Student(String myName, int myAge, String myGender, long myIdNum, Double myGPA) {
		this.Name=myName;
		this.Age=myAge;
		this.Gender=myGender;
		this.Id=myIdNum;
		this.Cgpa=myGPA;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name=name;
	}
	public String getGender()
	{
		return Gender;
	}
	public void setGender(String gender)
	{
		Gender=gender;
	}
	public int getAge()
	{
		return Age;
	}
	public void setAge(int age)
	{
		Age=age;
	}
	public long getId()
	{
		return Id;
	}
	public void setId(long id)
	{
		Id=id;
	}
	public double getCgpa()
	{
		return Cgpa;
	}
	public void setCgpa(double cgpa)
	{
		Cgpa=cgpa;
	}
}
 