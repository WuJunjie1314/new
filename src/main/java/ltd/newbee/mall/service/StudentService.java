package ltd.newbee.mall.service;

import java.util.ArrayList;

import ltd.newbee.mall.entity.Student;


public interface StudentService {

	ArrayList<Student> selectByName(String name);
	
}
