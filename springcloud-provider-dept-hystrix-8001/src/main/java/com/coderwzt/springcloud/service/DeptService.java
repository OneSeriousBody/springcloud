package com.coderwzt.springcloud.service;

import com.coderwzt.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
public interface DeptService {
  public boolean addDept(Dept dept);

  public Dept queryById(Long id);

  public List<Dept> queryAll();
}
