package top.xiongmingcai.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xiongmingcai.spring.injection.service.UserService;

public class InjectionApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:injection.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.createUser();
    }
}

