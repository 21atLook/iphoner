package com.bimgenuis.dao;


import com.bimgenuis.pojo.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface EmployeeMapper extends Mapper<Employee> {

    Employee queryEmployee();


    Number updateEmployee(@Param("id") Number id,@Param("name") String name,@Param("email") String email,
                          @Param("phone") String phone,@Param("wechat") String wechat, @Param("qq") String qq,
                          @Param("position") String zhiwu,@Param("position_name") String zhicheng,@Param("sculpture") String sculpture,
                          @Param("professionalDirection") String professionalDirection,@Param("isPublic") Boolean isPublic);

}
