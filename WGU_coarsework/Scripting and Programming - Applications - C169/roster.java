import java.util.ArrayList;
public class roster {
	static ArrayList<student>  myRoster = new ArrayList<>();
	public static void main(String[] args) {
		// add students. 
		roster.add("1","John","Smith","John1989@gmail.com",20,88, 79, 59);
		roster.add("2","Suzan","Erickson","Erickson_1990@gmailcom",19,91, 72, 85);
		roster.add("3","Jack","Napoli","The_lawyer99yahoo.com", 19,85, 84, 87 );
		roster.add("4","Erin","Black","Erin.black@comcast.net", 22,91,98,82);
		roster.add("5","Mike","Mohle","mmohle@wgu.edu", 57,100,95,90);
		// Print out student list
		print_all();
		// Print average grade
		printAverageGrade();
		// Print Invalid email
		printInValidEmail();
		
		// Remove Student ID.
		remove("3");
		// remove Student ID (in this case an error message is expected.
		remove("3");
	
	}
	
	public static void add(String studentID, String firstName, String lastName, 
			String emailAddress, int age,int grade1, int grade2, int grade3  ) {
			int[] grades = {grade1, grade2, grade3};
			student newStudent = new student(studentID, firstName, 
					lastName, emailAddress, age,grades  );
			myRoster.add(newStudent);
	}
		// print_all method	
		public static void print_all() {
			//loop though myRoster
			for( int i = 0; i < myRoster.size(); i ++) {
				myRoster.get(i).print();
				
			}
			
			
		}
	 // print average of grades per student
		public static void print_average_grade(String studentID ) {
			
	            int average = (studentID.getGrades()[0]+ studentID.getGrades()[1] + studentID.getGrades()[2])/3;
	            System.out.println("Student Id: " + studentID.getStudentID() + "\t Average Grade:\t" + average);	
			
		}
	// print invalid email addresses
		public static void printInValidEmail() {
			System.out.println("\nInvalid Email addresses");
			for (student s : myRoster){
				if (!(s.getemailAddress().contains("@"))
						|| !(s.getemailAddress().contains("."))
								||(s.getemailAddress().contains(" "))) {
					System.out.println(s.getemailAddress ());
				}
			}
		}
			
	// remove Student ID
		public static void remove(String studentID ) {
			for( int i = 0; i < myRoster.size(); i ++) {
				String checkID = myRoster.get(i).getsudentID();
				if (checkID.equals(studentID)){
					myRoster.remove(i);
					System.out.printf("\nStudent ID: %s is not found.\n", studentID);
					return;
					}
				}
			}
		
			
}
