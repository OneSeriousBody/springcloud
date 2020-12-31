package com.coderwzt.springcloud;

import com.coderwzt.myrule.WZTRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
//Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就去加载自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = WZTRule.class)
public class DeptConsumer_80 {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer_80.class, args);
  }

}
