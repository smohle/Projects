
public class student {
	private String studentID;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private int[] grades;
	
	// Constructor
	public student(String studentID, String firstName, String lastName, 
			String emailAddress, int age,int[] grades  ) {
		setstudentID(studentID);
		setfirstName(firstName);
		setlastName( lastName);
		setemailAddress(emailAddress);
		setage(age);
		setgrades(grades);		
	}
	
	// get methods
	public String getsudentID() {
		return studentID;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getemailAddress() {
		return emailAddress;
	}
	public int getage() {
		return age;
	}
	public int[] getgrades() {
		return grades;
	}
	// Set Methods
	public void setstudentID(String studentID) {
		this.studentID = studentID;
		}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public void setemailAddress(String emailAddress)  {
		this.emailAddress = emailAddress;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setgrades(int[] grades) {
		this.grades = grades;
	}	
	// Print Method
	public void print(){
		System.out.println("Student ID\t " +getsudentID() + "\tFirst Name\t " + getfirstName() 
		+ "\t Last Name\t " + getlastName() + "  Age\t " + getage() + 
		" Grades\t"+ "{"+getgrades()[0]+", "+getgrades()[1] + ", "+ getgrades()[2] +"}");
}
}
