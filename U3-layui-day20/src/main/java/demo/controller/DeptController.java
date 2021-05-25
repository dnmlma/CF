package demo.controller;

import demo.pojo.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/29 15:33
 * @Version 1.0
 */
@RestController
@RequestMapping("dept")
public class DeptController extends BaseController<Dept>{
}
