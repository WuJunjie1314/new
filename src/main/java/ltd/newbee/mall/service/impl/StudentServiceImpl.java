package ltd.newbee.mall.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.StudentMapper;
import ltd.newbee.mall.entity.Student;
import ltd.newbee.mall.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;
	
	@Override
	public ArrayList<Student> selectByName(String name) {
		return studentMapper.selectByName(name);
	}

}
