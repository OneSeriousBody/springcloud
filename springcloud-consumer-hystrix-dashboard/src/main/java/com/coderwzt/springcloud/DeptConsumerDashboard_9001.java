package com.coderwzt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@SpringBootApplication
//开启熔断监控
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001 {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumerDashboard_9001.class,args);
  }

}
