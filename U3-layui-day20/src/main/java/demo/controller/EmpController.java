package demo.controller;

import demo.pojo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/28 16:30
 * @Version 1.0
 */
//@RestController  // 只返回数据，不返回视图 @controller + @responseBody
@Controller
@RequestMapping("emp")
public class EmpController extends BaseController<Emp>{
}
