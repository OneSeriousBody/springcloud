package com.coderwzt.springcloud.dao;

import com.coderwzt.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@Mapper
@Repository
public interface DeptDao {
  public boolean addDept(Dept dept);

  public Dept queryById(Long id);

  public List<Dept> queryAll();
}
