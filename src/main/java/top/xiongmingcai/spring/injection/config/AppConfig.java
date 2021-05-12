package top.xiongmingcai.spring.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import top.xiongmingcai.spring.injection.dao.UserDAO;
import top.xiongmingcai.spring.injection.dao.UserDAOImpl;
import top.xiongmingcai.spring.injection.service.UserService;
import top.xiongmingcai.spring.injection.service.UserServiceImpl;

@Configuration
public class AppConfig {
    @Lazy
    @Bean//默认方法名为BeanID
    public UserDAO userDAO() {
        return new UserDAOImpl();
    }

    @Bean("userService")
//    @Scope("singleton") //默认情况下，scope="singleton"--表示单利
//    @Scope("prototype") //多例模式
    public UserService initService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDAO(userDAO());
        return userService;
    }
}
