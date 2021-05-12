package top.xiongmingcai.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:injection.xml");
//        UserService userService = (UserService) ctx.getBean("userService");
//        UserService userService2 = (UserService) ctx.getBean("userService");

//        System.out.println(userService ==  userService2);
    }
}

