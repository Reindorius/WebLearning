package com.reindorius.dao;

import com.reindorius.pojo.dept;
import com.reindorius.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

            List<dept> deptList = deptDao.getDepartmentList();
            dept oneDept = deptDao.getDeptByDeptno(20);

            for (dept deptItr : deptList) System.out.println(deptItr);

            System.out.println("\n" + oneDept);
        }
        catch (Exception e){ e.printStackTrace();}
        //deptList = new ArrayList<>(deptList);
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void add()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

        deptDao.addDept(new dept(50, "SALES", "CLEVELAND"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

        deptDao.updateDept(new dept(50,"SALES","ST. LOUIS"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delete()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

        deptDao.deleteDept(50);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void query2()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("RESEARCH","DALLAS");

        System.out.println(deptDao.getDeptByDeptno2(map));
    }

    @Test
    public void queryLike()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

        List<dept> queriedDept = deptDao.getDeptLike("%NEW%");

        for(dept newDept: queriedDept) System.out.println(newDept.toString());

        sqlSession.close();
    }
}
