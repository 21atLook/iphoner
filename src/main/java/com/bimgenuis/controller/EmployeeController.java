package com.bimgenuis.controller;

import com.bimgenuis.pojo.Employee;
import com.bimgenuis.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author swq
 * @create 2020-07-20-13:20
 */

@RestController
@Slf4j
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @GetMapping(value = "/queryEmployee")
    public Employee queryEmployee(){


        Employee employee =  employeeService.queryEmployee();

        return employee;


}


    @PutMapping(value ="/updateEmployee")
    public Number updateEmployee(@Param("id") Number id, @Param("name") String name, @Param("email") String email,
                                 @Param("phone") String phone, @Param("wechat") String wechat, @Param("qq") String qq,
                                 @Param("position") String zhiwu, @Param("position_name") String zhicheng, @Param("sculpture") String sculpture,
                                 @Param("professionalDirection") String professionalDirection, @Param("isPublic") Boolean isPublic){

        employeeService.updateEmployee( );

        return id;
    }


}
