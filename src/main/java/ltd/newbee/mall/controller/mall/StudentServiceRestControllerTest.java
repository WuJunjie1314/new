package ltd.newbee.mall.controller.mall;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.common.Constants;
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
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    @ResponseBody
    public Result categories(@RequestBody String name) {
    	
    	List<Student> list = studentService.selectByName(name);
        if (CollectionUtils.isEmpty(list)) {
        	return ResultGenerator.genErrorResult(Constants.CATEGORY_FETCH_ERROR, Constants.CATEGORY_FETCH_ERROR_MESSAGE);
        }else {
        	return ResultGenerator.genSuccessResult(list);
        }
    
    }

}
