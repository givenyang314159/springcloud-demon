package com.study.consumer.controller;

import com.study.common.bean.Dept;
import com.study.common.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptControllerConSumerFeign {
    @Autowired
    public DeptClientService service;
    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        System.out.println("consumer....");
        return this.service.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        System.out.println("=============");
        return this.service.list();
    }

    @PostMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }

}
