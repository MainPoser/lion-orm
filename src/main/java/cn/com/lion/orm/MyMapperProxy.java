package cn.com.lion.orm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tianyao
 * @Classname MyMapperProxy
 * @Description TODO
 * @Date 2019-12-26 13:20
 * @group smart video north
 */
public class MyMapperProxy implements InvocationHandler {
    public MyMapperProxy(mySqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public MyMapperProxy() {
    }

    private mySqlSession sqlSession;
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperClass = method.getDeclaringClass().getName();
        if (StudentMapperXml.namespace.equals(mapperClass)){
            String methodName = method.getName();
            String methodSql = StudentMapperXml.getMethodSql(methodName);
            //执行
            String formatSql = String.format(methodSql, String.valueOf(args[0]));
            //执行sql
            return sqlSession.selectOne(formatSql);
        }
        return null;
    }
}
