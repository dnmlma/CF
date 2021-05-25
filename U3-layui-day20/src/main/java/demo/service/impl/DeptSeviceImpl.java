package demo.service.impl;

import demo.dao.DeptMapper;
import demo.pojo.Dept;
import demo.service.DeptSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName DeptSeviceImpl
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/29 15:37
 * @Version 1.0
 */
@Service
@Transactional(readOnly = false)
public class DeptSeviceImpl extends BaseServiceImpl<Dept> implements DeptSevice {
}
