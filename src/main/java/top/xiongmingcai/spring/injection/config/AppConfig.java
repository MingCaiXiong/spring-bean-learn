package top.xiongmingcai.spring.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.xiongmingcai.spring.injection.dao.UserDAO;
import top.xiongmingcai.spring.injection.dao.UserDAOImpl;
import top.xiongmingcai.spring.injection.service.UserService;
import top.xiongmingcai.spring.injection.service.UserServiceImpl;

@Configuration
public class AppConfig {
    @Bean//默认方法名为BeanID
    public UserDAO userDAO() {
        return new UserDAOImpl();
    }

    @Bean("userService")
    public UserService initService() {
        UserService userService = new UserServiceImpl();
        userService.setUserDAO(userDAO());
        return userService;
    }
}
