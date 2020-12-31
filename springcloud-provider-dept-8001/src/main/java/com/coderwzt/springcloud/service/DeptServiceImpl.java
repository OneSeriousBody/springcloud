package com.coderwzt.springcloud.service;

import com.coderwzt.springcloud.dao.DeptDao;
import com.coderwzt.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  private DeptDao deptDao;

  @Override
  public boolean addDept(Dept dept) {
    return deptDao.addDept(dept);
  }

  @Override
  public Dept queryById(Long id) {
    return deptDao.queryById(id);
  }

  @Override
  public List<Dept> queryAll() {
    return deptDao.queryAll();
  }
}
