package top.xiongmingcai.spring.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.xiongmingcai.spring.injection.dao.UserDAO;
import top.xiongmingcai.spring.injection.dao.UserDAOImpl;

@Configuration
public class AppConfig {
    @Bean
    public UserDAO userDAO() {
        return new UserDAOImpl();
    }
}
