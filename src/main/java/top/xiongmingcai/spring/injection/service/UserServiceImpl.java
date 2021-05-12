package top.xiongmingcai.spring.injection.service;

import top.xiongmingcai.spring.injection.dao.UserDAO;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl() {
        System.out.println(this.hashCode() + ":已创建UserServiceImpl 无参构造方法  ");
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void createUser() {
        System.out.println(this.hashCode() + ":正在调用UserService.createUser()");
        userDAO.insert();
    }
}
