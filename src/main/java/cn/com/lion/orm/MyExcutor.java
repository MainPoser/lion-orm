package cn.com.lion.orm;

/**
 * @author tianyao
 * @Classname MyExcutor
 * @Description TODO
 * @Date 2019-12-25 13:56
 * @group smart video north
 */
public interface MyExcutor {
    public <T> T query(String statement);
}
