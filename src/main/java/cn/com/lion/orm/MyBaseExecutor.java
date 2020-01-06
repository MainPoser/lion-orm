package cn.com.lion.orm;

import java.sql.*;

/**
 * @author tianyao
 * @Classname MyBaseExecutor
 * @Description TODO
 * @Date 2019-12-25 13:57
 * @group smart video north
 */
public class MyBaseExecutor implements MyExcutor {
    private static final String CONNECTIONURL = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    public <T> T query(String statement) {
        //jdbc完成DB操作获取 结果
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONURL,USERNAME,PASSWORD);
            String sql = statement;
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Student student = null;
            if (resultSet.next()){
                student.setId(resultSet.getInt("id"));
                student.setAge(resultSet.getInt("age"));
                student.setSex(resultSet.getInt("sex"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
            }
            return (T)student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
