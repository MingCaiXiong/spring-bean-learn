package top.xiongmingcai.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xiongmingcai.spring.aop.config.BeanConfig;

public class AopApplication {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:aop.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        UserService userService = (UserService) ctx.getBean("userService");
        userService.createUser();

    }
}

