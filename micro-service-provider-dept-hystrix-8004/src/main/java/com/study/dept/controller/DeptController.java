package com.study.dept.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    public boolean add(@RequestBody Dept dept) {
        System.out.println(dept.toString());
        System.out.println("dept controller....");
        return service.add(dept);

    }

    @GetMapping("/dept/get/{id}")
    //@HystrixCommand(fallbackMethod = "getNoneId")
    public Dept get(@PathVariable Long id) {
        System.out.println("====================服务提供者================");
       if(null==service.get(id))
       {
           throw new RuntimeException("id"+id+"无效");
       }
        return service.get(id);
    }

    public Dept getNoneId(@PathVariable Long id)
    {
        System.out.println("调用熔断fallback 方法");
        return new Dept().setDeptno(id).setDname("没有"+id+"的Dept").setDb_source("No Data in database");
    }

    //    @GetMapping("dept/list")
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        System.out.println("dept list ....");
        return service.list();
    }
}
