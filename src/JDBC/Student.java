package JDBC;

public class Student {
	

	private int studentId;
	private String studentName;
	private int studentPhone;
	private String studentCityString;
	public Student(int studentId, String studentName, int studentPhone, String studentCityString) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCityString = studentCityString;
	}
	public Student(String studentName, int studentPhone, String studentCityString) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCityString = studentCityString;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(int studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCityString() {
		return studentCityString;
	}
	public void setStudentCityString(String studentCityString) {
		this.studentCityString = studentCityString;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCityString + "]";
	}
	


}
