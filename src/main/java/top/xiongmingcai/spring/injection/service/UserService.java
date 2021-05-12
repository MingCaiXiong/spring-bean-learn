package top.xiongmingcai.spring.injection.service;


import top.xiongmingcai.spring.injection.dao.UserDAO;

public interface UserService {

    void setUserDAO(UserDAO userDAO);

    void createUser();
}
