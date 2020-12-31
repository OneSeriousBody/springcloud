package com.coderwzt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
//启动后，访问localhost:7001/
@SpringBootApplication
@EnableEurekaServer //服务端的启动类，可以接受别人的服务注册进来
public class EurekaServer_7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServer_7001.class,args);
  }

}
