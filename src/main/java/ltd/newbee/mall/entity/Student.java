package ltd.newbee.mall.entity;

public class Student {
	
	private int studentID ;
	private String studentName;
	private int studentAge ;
	private String studentSexual;
	private String studentClass;
	private String studentAddress;
	private String studentTelephone;
	private int studentScore;
	private String studentHometown;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentSexual() {
		return studentSexual;
	}
	public void setStudentSexual(String studentSexual) {
		this.studentSexual = studentSexual;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentTelephone() {
		return studentTelephone;
	}
	public void setStudentTelephone(String studentTelephone) {
		this.studentTelephone = studentTelephone;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	public String getStudentHometown() {
		return studentHometown;
	}
	public void setStudentHometown(String studentHometown) {
		this.studentHometown = studentHometown;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentSexual=" + studentSexual + ", studentClass=" + studentClass + ", studentAddress="
				+ studentAddress + ", studentTelephone=" + studentTelephone + ", studentScore=" + studentScore
				+ ", studentHometown=" + studentHometown + "]";
	}
	
	
}
