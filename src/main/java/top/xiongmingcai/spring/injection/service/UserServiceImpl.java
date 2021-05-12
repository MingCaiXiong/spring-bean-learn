package top.xiongmingcai.spring.injection.service;

import top.xiongmingcai.spring.injection.dao.UserDAO;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Override
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void createUser() {
        System.out.println(this.hashCode() + ":正在调用UserService.createUser()");
        userDAO.insert();
    }
}
