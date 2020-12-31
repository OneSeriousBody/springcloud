package com.coderwzt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@SpringBootApplication
@EnableEurekaClient
// feign客户端注解,并指定要扫描的包以及配置接口DeptClientService
@EnableFeignClients(basePackages = {"com.coderwzt.springcloud"})
//@ComponentScan(value = "com.coderwzt.springcloud")
public class FeignDeptConsumer_80 {

  public static void main(String[] args) {
    SpringApplication.run(FeignDeptConsumer_80.class, args);
  }

}
