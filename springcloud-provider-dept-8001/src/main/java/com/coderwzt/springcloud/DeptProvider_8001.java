package com.coderwzt.springcloud;

import com.netflix.hystrix.HystrixMetrics;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletRegistration;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
//启动类
@SpringBootApplication
@EnableEurekaClient //在服务端自动到Eureka中
@EnableDiscoveryClient  //服务发现
public class DeptProvider_8001 {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider_8001.class,args);
  }

  //增加一个Servlet
  @Bean
  public ServletRegistrationBean getHystrixMetricsStreamServlet(){
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
    servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
    return servletRegistrationBean;
  }

}