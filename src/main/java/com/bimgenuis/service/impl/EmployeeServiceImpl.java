package com.bimgenuis.service.impl;

import com.bimgenuis.dao.EmployeeMapper;
import com.bimgenuis.pojo.Employee;
import com.bimgenuis.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author swq
 * @create 2020-07-20-12:43
 */

@Service
public class EmployeeServiceImpl {

    @Resource
    private EmployeeMapper employeeMapper;

    public Employee queryEmployee() {

        return employeeMapper.queryEmployee();
    }

    public Number updateEmployee(      ) {
         employeeMapper.updateEmployee(   );




    }
}
