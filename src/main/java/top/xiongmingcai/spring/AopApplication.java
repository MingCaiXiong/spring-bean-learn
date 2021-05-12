package top.xiongmingcai.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xiongmingcai.spring.aop.UserService;

public class AopApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:aop.xml");
        UserService userService1 = (UserService) ctx.getBean("userService");
        userService1.createUser();
    }
}
