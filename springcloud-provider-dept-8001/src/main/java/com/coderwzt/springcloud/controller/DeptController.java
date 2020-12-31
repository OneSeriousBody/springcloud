package com.coderwzt.springcloud.controller;

import com.coderwzt.springcloud.pojo.Dept;
import com.coderwzt.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
//提高Restful服务
@RestController
public class DeptController {

  @Autowired
  private DeptService deptService;
  //获取配置信息，得到具体的微服务
  @Autowired
  private DiscoveryClient client;

  @PostMapping("/dept/add")
  public boolean addDept(Dept dept){
    return deptService.addDept(dept);
  }

  @GetMapping("/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id){
    return deptService.queryById(id);
  }

  @GetMapping("/dept/list")
  public List<Dept> list(){
    return deptService.queryAll();
  }

  //注册进来的微服务，获取一些信息
  @GetMapping("/dept/discovery")
  public Object discovery(){
    //获取微服务列表的清单
    List<String> services = client.getServices();
    System.out.println("discovery=>services:" + services);

    //通过具体的微服务id，得到一个具体的微服务信息
    List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
    for (ServiceInstance instance : instances) {
      System.out.println(instance.getHost() + "\t" +
                          instance.getPort() + "\t" +
                          instance.getUri() + "\t" +
                          instance.getServiceId()
      );
    }
    return this.client;
  }

}
