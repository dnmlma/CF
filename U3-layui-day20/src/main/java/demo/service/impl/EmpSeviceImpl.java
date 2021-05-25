package demo.service.impl;

import demo.dao.EmpMapper;
import demo.pojo.Emp;
import demo.service.EmpSevice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpSeviceImpl
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/28 16:42
 * @Version 1.0
 */
@Service
@Transactional(readOnly = false)
public class EmpSeviceImpl extends BaseServiceImpl<Emp> implements EmpSevice {
}
