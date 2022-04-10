package com.wjw.test;
/*
 * 入门程序测试类
 */

import com.wjw.po.Customer;
import com.wjw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Mybatis test.
 *
 * @author 枫缪
 */
public class MybatisTest {
    /**
     * 根据客户姓名和职业组合条件查询客户信息列表
     */
    @Test
    public void findCustomerByNameAndJobsTest() {
        //通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        //创建Customer对象，封装需要组合查询的条件
        Customer customer = new Customer();
        //customer.setUsername("Jack");
        customer.setJobs("DOCTOR");
        //执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByNameAndJobs", customer);
        //输出查询结果信息
        for (Customer customer2 : customers) {
            //打印输出结果
            System.out.println(customer2);
        }
        //关闭SqlSession
        session.close();
    }

    @Test
    public void findCustomerByNameOrJobs() {
        //通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        //创建Customer对象，封装需要组合查询的条件
        Customer customer = new Customer();
        //customer.setUsername("Jack");
        //customer.setJobs("DOCTOR");
        //执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByNameOrJobs", customer);
        //输出查询结果信息
        for (Customer customer2 : customers) {
            //打印输出结果
            System.out.println(customer2);
        }
        //关闭SqlSession
        session.close();
    }

    @Test
    public void updateCustomerTest() {
        //获取SqlSession
        SqlSession session = MybatisUtils.getSession();
        //创建Customer对象，并向对象中添加数据
        Customer customer = new Customer();
        customer.setId(2);
        customer.setPhone("1829492");
        //执行SqlSession的更新方法，返回的是SQL语句影响的行数
        int rows = session.update("com.wjw.mapper.CustomerMapper.updateCustomer", customer);
        //通过返回结果判断更新操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功修改了" + rows + "条数据!");
        } else {
            System.out.println("执行修改操作失败！");
        }
        //提交事务
        session.commit();
        //关闭sqlsession
        session.close();
    }

    /**
     * 根据客户编号查询客户信息
     */
    @Test
    public void findCustomerByIdsTest() {
        //获取SqlSession
        SqlSession session = MybatisUtils.getSession();
        //创建List集合，封装查询id
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        //执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByIds", ids);
        //输出查询结果信息
        for (Customer customer : customers) {
            //打印输出结果
            System.out.println(customer);
        }
        //关闭SqlSession
        session.close();
    }

    /**
     * <bind>元素的使用：根据客户名模糊查询客户信息
     */
    @Test
    public void findCustomerByNameTest() {
        //获取SqlSession
        SqlSession session = MybatisUtils.getSession();
        //创建Customer对象，封装查询的条件
        Customer customer = new Customer();
        customer.setUsername("j");
        //执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByName", customer);
        for (Customer customer2 : customers) {
            //打印输出结果
            System.out.println(customer2);
        }
        //关闭SqlSession
        session.close();
    }
}
