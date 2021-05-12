package top.xiongmingcai.spring.injection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
    public UserDAOImpl() {
        System.out.print(this.hashCode() + "已创建");
        System.out.println("UserDAOImpl 无参构造方法");
    }

    @Override
    public void insert() {
        System.out.println(this.hashCode() + ":UserDAOImpl.insert");
    }
}
