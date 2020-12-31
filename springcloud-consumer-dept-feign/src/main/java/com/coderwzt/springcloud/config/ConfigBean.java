package com.coderwzt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@Configuration
public class ConfigBean {

  //配置负载均衡实现restTemplate
  //  IRule
  //  RoundRobinRule 轮询
  //  RandomRule 随机
  //  AvailabilityFilteringRule : 会先过滤掉，跳闸（奔溃）的服务，对剩下的进行轮询
  //  RetryRule
  @Bean
  @LoadBalanced //Ribbon负载均衡
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

//  @Bean
//  public IRule myRule(){
//    return new RandomRule();
//  }

}
