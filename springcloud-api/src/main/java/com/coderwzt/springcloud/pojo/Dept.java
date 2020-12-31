package com.coderwzt.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.lang.annotation.Retention;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable { //网络通信实体类必须序列化
  private long deptno;
  private String dname;
  //描述这个数据存在哪个数据库的字段 ~ 微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
  private String db_source;

  public Dept(String dname) {
    this.dname = dname;
  }

  /*
    链式写法
    Dept dept = new Dept();

    dept.setDeptno(11).setDname('ssss').setDb_source('');
   */
}
