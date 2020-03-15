package com.example.demo.mapper;

import com.example.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    Employee getEmployeeInfo(String employeeUid);
}
