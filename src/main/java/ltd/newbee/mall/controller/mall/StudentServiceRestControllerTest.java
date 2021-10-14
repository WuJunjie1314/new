package ltd.newbee.mall.controller.mall;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.common.Constants;
import ltd.newbee.mall.common.ServiceResultEnum;
import ltd.newbee.mall.controller.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mall.entity.Student;
import ltd.newbee.mall.service.StudentService;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;

@Controller
public class StudentServiceRestControllerTest {
	
	@Resource
    private StudentService studentService;
	
    //@CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    @ResponseBody
    public Result selectByName(@RequestBody String name) {
    	
    	List<Student> list = studentService.selectByName(name);
        if (CollectionUtils.isEmpty(list)) {
        	return ResultGenerator.genErrorResult(Constants.CATEGORY_FETCH_ERROR, Constants.CATEGORY_FETCH_ERROR_MESSAGE);
        }else {
        	return ResultGenerator.genSuccessResult(list);
        }
    }

    @RequestMapping(value = "/insertStudent", method = RequestMethod.POST)
    @ResponseBody
    public Result insertStudent(@RequestBody Student s) {
    	
    	int count = studentService.insertStudent(s);
        if (count<=0) {
        	return ResultGenerator.genErrorResult(Constants.CATEGORY_FETCH_ERROR, Constants.CATEGORY_FETCH_ERROR_MESSAGE);
        }else {
        	return ResultGenerator.genSuccessResult("挿入できました");
        }
    }

    @PutMapping(value = "/updateStudent")
    @ResponseBody
    public Result updateStudent(@RequestBody Student s) {
    	
    	String count = studentService.updateStudent(s);
        if (count.equals(ServiceResultEnum.SUCCESS.getResult())) {
        	return ResultGenerator.genSuccessResult("更新できました");
        }else {
        	return ResultGenerator.genErrorResult(Constants.CATEGORY_FETCH_ERROR, Constants.CATEGORY_FETCH_ERROR_MESSAGE);
        }
    }
    
    @DeleteMapping(value = "/deleteStudent/{studentID}")
    @ResponseBody
    public Result deleteStudent(@PathVariable("studentID") int studentID) {
    	
    	boolean count = studentService.deleteStudentByStudentID(studentID);
        if (count) {
        	return ResultGenerator.genSuccessResult("削除しました");
        }else {
        	return ResultGenerator.genErrorResult(Constants.CATEGORY_FETCH_ERROR, Constants.CATEGORY_FETCH_ERROR_MESSAGE);
        }
    }
    
}
