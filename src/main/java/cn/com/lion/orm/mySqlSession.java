package cn.com.lion.orm;

/**
 * @author tianyao
 * @Classname mySqlSession
 * @Description TODO
 * @Date 2019-12-25 19:04
 * @group smart video north
 */
public interface mySqlSession {
    <T> T selectOne(String sql);
    <T> T getMapper(Class<T> clazz);
}
