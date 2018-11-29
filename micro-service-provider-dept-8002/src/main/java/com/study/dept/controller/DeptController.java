package com.study.dept.controller;

import com.study.common.bean.Dept;
import com.study.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService service;
    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept )
    {
        System.out.println(dept.toString());
        System.out.println("dept controller....");
         return service.add(dept);

    }
    @GetMapping("/dept/get/{id}")
    public Dept get (@PathVariable Long id)
    {
        return service.get(id);
    }
//    @GetMapping("dept/list")
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list()
    {
        System.out.println("dept list ....");
        return service.list();
    }
}
