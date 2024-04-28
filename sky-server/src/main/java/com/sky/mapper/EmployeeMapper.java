package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     *
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 保存员工信息
     *
     * @param employee
     */
    @Insert("insert into employee (name,username,password,phone,id_number,create_time,update_time ,create_user ,update_user,status,sex)" +
            "value " +
            "(#{name},#{username},#{password},#{phone},#{idNumber},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status},#{sex})")
    void inser(Employee employee);
}
