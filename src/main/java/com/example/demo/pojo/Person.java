package com.example.demo.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;

@Data
public class Person {
    @JSONField(name = "person_name")
    private String personName;

    @JSONField(name = "person_age")
    private String personAge;

    @JSONField(name = "date",format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

}
