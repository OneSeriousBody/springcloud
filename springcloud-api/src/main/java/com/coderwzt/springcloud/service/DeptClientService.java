package com.coderwzt.springcloud.service;

import com.coderwzt.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */

@Component
// @FeignClient:微服务客户端注解,value:指定微服务的名字,这样就可以使Feign客户端直接找到对应的微服务
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

  @GetMapping("/dept/get/{id}")
  public Dept queryById(@PathVariable("id") Long id);

  @GetMapping("/dept/list")
  public List<Dept> queryAll();

  @GetMapping("/dept/add")
  public boolean addDept(Dept dept);

}
