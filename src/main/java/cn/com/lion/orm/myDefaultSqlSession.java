package cn.com.lion.orm;


import java.lang.reflect.Proxy;

/**
 * @author tianyao
 * @Classname myDefaultSqlSession
 * @Description TODO
 * @Date 2019-12-25 19:07
 * @group smart video north
 */
public class myDefaultSqlSession implements mySqlSession {
    private MyExcutor executor = new MyBaseExecutor();

    public <T> T selectOne(String sql) {
        return executor.query(sql);
    }

    public <T> T getMapper(Class<T> interfaces) {
        return (T)Proxy.newProxyInstance(interfaces.getClassLoader(),new Class[]{interfaces},new MyMapperProxy(this));
    }
}
