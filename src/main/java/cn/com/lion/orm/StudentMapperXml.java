package cn.com.lion.orm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tianyao
 * @Classname StudentMapperXml
 * @Description TODO
 * @Date 2019-12-25 19:01
 * @group smart video north
 */
public class StudentMapperXml {
    public static final String namespace =  "com.cn.com.lion.orm.studentMapper";
    private static Map<String,String> methodSqlMap = new HashMap<String, String>();

    static {
        methodSqlMap.put("findStudentById","select * from student");
    }
    public static String getMethodSql(String method){
        return methodSqlMap.get(method);
    }
}
