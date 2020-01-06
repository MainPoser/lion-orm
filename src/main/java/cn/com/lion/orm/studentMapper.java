package cn.com.lion.orm;

/**
 * @author tianyao
 * @Classname studentMapper
 * @Description TODO
 * @Date 2019-12-25 18:56
 * @group smart video north
 */
public interface studentMapper {
    public Student findStudentById();
    public void insertStudent(Student student);
}
