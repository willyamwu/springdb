package io.williamwu.springdb.mapper;

import io.williamwu.springdb.entity.Student;
import io.williamwu.springdb.entity.Subject;
import io.williamwu.springdb.entity.Teacher;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import static org.apache.ibatis.type.JdbcType.VARCHAR;
import static org.apache.ibatis.type.JdbcType.TIMESTAMP;
import static org.apache.ibatis.type.JdbcType.INTEGER;

public interface BridgeMapper {

    @Select("SELECT stu.* FROM subject sbj " +
            "JOIN schedule skd ON sbj.id = skd.subject_id " +
            "JOIN student stu ON skd.student_id = stu.id " +
            "WHERE sbj.subject_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "id", jdbcType = INTEGER),
            @Result(property = "studentName", column = "student_name", jdbcType = VARCHAR),
            @Result(property = "age", column = "student_age", jdbcType = INTEGER),
            @Result(property = "gender", column = "student_gender", jdbcType = VARCHAR),
            @Result(property = "createTime", column = "create_time", jdbcType = TIMESTAMP),
            @Result(property = "modifyTime", column = "modify_time", jdbcType = TIMESTAMP)
    })
    List<Student> subjectFindStudents(String name);

    @Select("SELECT tch.* FROM subject sbj " +
            "JOIN teacher tch ON sbj.teacher_id = tch.id " +
            "WHERE sbj.subject_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "id", jdbcType = INTEGER),
            @Result(property = "teacherName", column = "teacher_name", jdbcType = VARCHAR),
            @Result(property = "age", column = "teacher_age", jdbcType = INTEGER),
            @Result(property = "gender", column = "teacher_gender", jdbcType = VARCHAR),
            @Result(property = "createTime", column = "create_time", jdbcType = TIMESTAMP),
            @Result(property = "modifyTime", column = "modify_time", jdbcType = TIMESTAMP)
    })
    List<Teacher> subjectFindTeachers(String name);

    @Select("SELECT sbj.* FROM subject sbj " +
            "JOIN schedule skd ON sbj.id = skd.subject_id " +
            "JOIN student stu ON skd.student_id = stu.id " +
            "WHERE stu.student_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "id", jdbcType = INTEGER),
            @Result(property = "subjectName", column = "subject_name", jdbcType = VARCHAR),
            @Result(property = "subjectDay", column = "subject_day", jdbcType = VARCHAR),
            @Result(property = "subjectPeriod", column = "subject_period", jdbcType = VARCHAR),
            @Result(property = "createTime", column = "create_time", jdbcType = TIMESTAMP),
            @Result(property = "modifyTime", column = "modify_time", jdbcType = TIMESTAMP),
            @Result(property = "teacherId", column = "teacher_id", jdbcType = INTEGER)
    })
    List<Subject> studentFindSubjects(String name);

    @Select("SELECT stu.* FROM teacher tch " +
            "JOIN schedule skd ON skd.teacher_id = tch.id " +
            "JOIN student stu ON skd.student_id = stu.id " +
            "WHERE tch.teacher_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "id", jdbcType = INTEGER),
            @Result(property = "studentName", column = "student_name", jdbcType = VARCHAR),
            @Result(property = "age", column = "student_age", jdbcType = INTEGER),
            @Result(property = "gender", column = "student_gender", jdbcType = VARCHAR),
            @Result(property = "createTime", column = "create_time", jdbcType = TIMESTAMP),
            @Result(property = "modifyTime", column = "modify_time", jdbcType = TIMESTAMP)
    })
    List<Student> teacherFindStudents(String name);

    @Select("SELECT sbj.* FROM subject sbj " +
            "JOIN teacher tch ON sbj.teacher_id = tch.id " +
            "WHERE tch.teacher_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "id", jdbcType = INTEGER),
            @Result(property = "subjectName", column = "subject_name", jdbcType = VARCHAR),
            @Result(property = "subjectDay", column = "subject_day", jdbcType = VARCHAR),
            @Result(property = "subjectPeriod", column = "subject_period", jdbcType = VARCHAR),
            @Result(property = "createTime", column = "create_time", jdbcType = TIMESTAMP),
            @Result(property = "modifyTime", column = "modify_time", jdbcType = TIMESTAMP),
            @Result(property = "teacherId", column = "teacher_id", jdbcType = INTEGER)
    })
    List<Subject> teacherFindSubjects(String name);

}