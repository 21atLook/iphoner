package com.bimgenuis.service;

import com.bimgenuis.pojo.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author swq
 * @create 2020-07-20-12:43
 */
public interface EmployeeService {


    Employee queryEmployee();


    Number updateEmployee(Number id, String name,String email, String phone,String wechat,String qq,
                        String position, String position_name,String sculpture,
                        String professionalDirection, Boolean isPublic);

}
