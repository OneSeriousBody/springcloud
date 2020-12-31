package com.coderwzt.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author CoderWZT
 * @Create on 2020/12/30.
 */
@Configuration
public class WZTRule {

  @Bean
  public IRule myRule(){
    return new MyRandomRule();
  }
}
