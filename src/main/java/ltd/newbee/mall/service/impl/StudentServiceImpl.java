package ltd.newbee.mall.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.common.ServiceResultEnum;
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

	@Override
	public int insertStudent(Student s) {
		int id = studentMapper.getMaxStudentID();
		s.setStudentID(id + 1);
		return studentMapper.insertStudent(s);
	}

	@Override
	public String updateStudent(Student s) {
		Student temp = studentMapper.selectByStudentID(s.getStudentID());
        if (temp == null) {
            return ServiceResultEnum.DATA_NOT_EXIST.getResult();
        }
        if (studentMapper.updateByStudentIDSelective(s) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
	}

	@Override
	public boolean deleteStudentByStudentID(int studentID) {
		return studentMapper.deleteStudentByStudentID(studentID);
	}

//	@Override
//	public int selectByStudentID(int studentID) {
//		return studentMapper.selectByStudentID(studentID);
//	}

}
