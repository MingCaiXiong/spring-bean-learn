package top.xiongmingcai.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import top.xiongmingcai.spring.aop.SampleAspect;
import top.xiongmingcai.spring.aop.UserService;
import top.xiongmingcai.spring.injection.service.UserServiceImpl;

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
