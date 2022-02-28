class Student {
	String studentName = "Kushagra Wadhwa";
	int rollNumber = 228;
	String collegeName = "JECRC University";
}

public class ExInheritance extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String studentName = "Kushagra";
		Student st = new Student();

		System.out.println("Student Name is: " + st.studentName);
		System.out.println("Roll number is: " + st.rollNumber);
		System.out.println("College Name is: " + st.collegeName);

	}

}
