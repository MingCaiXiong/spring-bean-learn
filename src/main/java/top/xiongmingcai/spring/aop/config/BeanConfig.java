package top.xiongmingcai.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import top.xiongmingcai.spring.aop.SampleAspect;
import top.xiongmingcai.spring.aop.UserService;

@ComponentScan("top.xiongmingcai.spring.aop")
@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

    @Bean("userService")
    public UserService userService() {
        UserService userService = new UserService();
        return userService;
    }

    @Bean
    public SampleAspect sampleAspect() {
        return new SampleAspect();
    }
}
