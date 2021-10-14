package ltd.newbee.mall.service;

import java.util.ArrayList;

import ltd.newbee.mall.entity.Student;


public interface StudentService {

	ArrayList<Student> selectByName(String name);
	
	int insertStudent(Student s);
	
//	int selectByStudentID(int studentID);
	
	String updateStudent(Student s);
	
	boolean deleteStudentByStudentID(int studentID);
	
}
