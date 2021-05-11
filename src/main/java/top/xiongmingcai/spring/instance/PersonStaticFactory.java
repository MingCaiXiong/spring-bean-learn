package top.xiongmingcai.spring.instance;

/**
 * Person静态工厂
 */
public class PersonStaticFactory {
    public static Person createPerson(String name, Integer age) {
        return new Person(name, age);
    }
}
