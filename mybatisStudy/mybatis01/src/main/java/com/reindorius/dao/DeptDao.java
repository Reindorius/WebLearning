package com.reindorius.dao;

import com.reindorius.pojo.dept;

import java.util.List;
import java.util.Map;

public interface DeptDao {
    //query all fields
    public List<dept> getDepartmentList();

    //query according to deptno
    public dept getDeptByDeptno(int deptno);

    public dept getDeptByDeptno2(Map<String,Object> map);

    //insert
    //理论上添加用户会返回一个int值，但是那样会报错，所以这里暂时改为void
    public void addDept(dept newDept);

    //update
    public void updateDept(dept newDept);

    //delete
    public void deleteDept(int deptno);

    //模糊查询
    public List<dept> getDeptLike(String value);
}
