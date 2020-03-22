package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Employee;
import com.example.demo.pojo.Person;
import com.example.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/a")
public class HelloDemo {
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello!";
    }
    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "hello2!";
    }

    @RequestMapping("/testMapper")
    @ResponseBody
    public String mapper() {
        Employee employeeInfo = employeeService.getEmployeeInfo("111111");
        log.info("name{}",employeeInfo.getEmployeeName());
        return "mapper!";
    }


    @RequestMapping(value = "/testMapper2", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String listMerchantChannel(@RequestBody String payload) {
        Person person = JSON.parseObject(payload, Person.class);
        return "1";
    }



}
