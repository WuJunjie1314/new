package ltd.newbee.mall.controller.mall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.entity.Student;
import ltd.newbee.mall.service.StudentService;

@SpringBootTest
public class StudentControllerTest {

	
		@Resource
		StudentService studentService; 
		
		@Resource
		String name;
		
		String name1 = "王小丽";
		String name2 = "王小丫";
	
		@Test
		public void testLength() {
			
			ArrayList<Student> list = studentService.selectByName(name);
			if(list != null && !list.isEmpty()) {
				assertEquals(2,list.size());
			}
			
		}
		
		@Test
		public void ifMatchName() {
			ArrayList<Student> list = studentService.selectByName(name);
			for (Student s : list) {
				assertTrue(name1.equals(s.getStudentName()) || name2.equals(s.getStudentName()));
			}
		}
	
}
