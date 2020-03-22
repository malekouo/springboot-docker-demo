package com.example.demo.service.impl;

import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = "empl")
    @Override
    public Employee getEmployeeInfo(String employeeUid) {
        return employeeMapper.getEmployeeInfo(employeeUid);
    }
}
