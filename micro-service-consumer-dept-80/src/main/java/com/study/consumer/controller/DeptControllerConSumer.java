package com.study.consumer.controller;

import com.study.common.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptControllerConSumer {
    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX="http://localhost:8001"; // 直接调用服务
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";    //调用微服务


    @GetMapping("/consumer/dept/add")
    public boolean add(Dept dept)
    {
        System.out.println(dept.toString());
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id)
    {
        System.out.println("consumer get "+id );
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
    @GetMapping("/consumer/dept/list")
    public List<Dept> list()
    {
        System.out.println("comsumer list ....");
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
