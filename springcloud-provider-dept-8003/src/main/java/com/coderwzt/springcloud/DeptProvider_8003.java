package com.coderwzt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
//启动类
@SpringBootApplication
@EnableEurekaClient //在服务端自动到Eureka中
@EnableDiscoveryClient  //服务发现
public class DeptProvider_8003 {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider_8003.class,args);
  }

}
