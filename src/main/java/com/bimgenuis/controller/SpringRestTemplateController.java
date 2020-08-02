package com.bimgenuis.controller;

import cn.hutool.db.PageResult;
import com.bimgenuis.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class SpringRestTemplateController {

    @Resource
    private RestTemplate restTemplate;

    public static final String INVOKE_URL = "http://116.62.130.190:1010/bimgenius/tenant/api";

    Employee employee =new Employee();

    @GetMapping("/getDeptUserList")
    public ResponseEntity  getDeptUserList() {

        ResponseEntity  result = restTemplate.getForEntity(INVOKE_URL,ResponseEntity.class);

            return result;

            result.getBody().





    }
}