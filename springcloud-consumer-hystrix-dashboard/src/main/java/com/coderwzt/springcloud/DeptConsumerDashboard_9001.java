package com.coderwzt.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

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
