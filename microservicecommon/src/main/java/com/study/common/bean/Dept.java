package com.study.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private  Long deptno;
    private String dname;
    private String db_source;

    public Dept(String deptname) {
        this.dname = deptname;
    }

    public static void main(String[] args) {
    Dept dept =new Dept();
    }
}
