package com.example.demo.controller;

import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.pojo.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloDemo {
    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello!";
    }

    @RequestMapping("/testMapper")
    @ResponseBody
    public String mapper() {
        Employee employeeInfo = employeeMapper.getEmployeeInfo("111111");
        log.info("name{}",employeeInfo.getEmployeeName());
        return "mapper!";
    }


}
