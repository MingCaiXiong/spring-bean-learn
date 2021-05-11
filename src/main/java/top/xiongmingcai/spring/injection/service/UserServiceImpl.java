package top.xiongmingcai.spring.injection.service;

import top.xiongmingcai.spring.injection.dao.UserDAO;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl() {
        System.out.println(this.hashCode() + "已创建");
    }

    //通过构造函数注入
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
        System.out.println(this.hashCode() + ":正在调用构造函数注入，UserServiceImpl(" + userDAO + ")");
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
        System.out.println(this.hashCode() + ":正在调用Setter方法注入，setUserDAO(" + userDAO + ")");
    }

    @Override
    public void createUser() {
        System.out.println(this.hashCode() + ":正在调用UserService.createUser()");
        userDAO.insert();
    }
}
