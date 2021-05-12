package top.xiongmingcai.spring.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.xiongmingcai.spring.aop.config.BeanConfig;

class AopApplicationTest {
    @Test
    void main() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        UserService userService = (UserService) ctx.getBean("userService");
        userService.createUser();
    }
}