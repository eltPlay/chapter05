package com.wjw.test;
/*
 * ���ų��������
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
 * @author ����
 */
public class MybatisTest {
    /**
     * ���ݿͻ�������ְҵ���������ѯ�ͻ���Ϣ�б�
     */
    @Test
    public void findCustomerByNameAndJobsTest() {
        //ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //����Customer���󣬷�װ��Ҫ��ϲ�ѯ������
        Customer customer = new Customer();
        //customer.setUsername("Jack");
        customer.setJobs("DOCTOR");
        //ִ��SqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByNameAndJobs", customer);
        //�����ѯ�����Ϣ
        for (Customer customer2 : customers) {
            //��ӡ������
            System.out.println(customer2);
        }
        //�ر�SqlSession
        session.close();
    }

    @Test
    public void findCustomerByNameOrJobs() {
        //ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //����Customer���󣬷�װ��Ҫ��ϲ�ѯ������
        Customer customer = new Customer();
        //customer.setUsername("Jack");
        //customer.setJobs("DOCTOR");
        //ִ��SqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByNameOrJobs", customer);
        //�����ѯ�����Ϣ
        for (Customer customer2 : customers) {
            //��ӡ������
            System.out.println(customer2);
        }
        //�ر�SqlSession
        session.close();
    }

    @Test
    public void updateCustomerTest() {
        //��ȡSqlSession
        SqlSession session = MybatisUtils.getSession();
        //����Customer���󣬲���������������
        Customer customer = new Customer();
        customer.setId(2);
        customer.setPhone("1829492");
        //ִ��SqlSession�ĸ��·��������ص���SQL���Ӱ�������
        int rows = session.update("com.wjw.mapper.CustomerMapper.updateCustomer", customer);
        //ͨ�����ؽ���жϸ��²����Ƿ�ִ�гɹ�
        if (rows > 0) {
            System.out.println("���ɹ��޸���" + rows + "������!");
        } else {
            System.out.println("ִ���޸Ĳ���ʧ�ܣ�");
        }
        //�ύ����
        session.commit();
        //�ر�sqlsession
        session.close();
    }

    /**
     * ���ݿͻ���Ų�ѯ�ͻ���Ϣ
     */
    @Test
    public void findCustomerByIdsTest() {
        //��ȡSqlSession
        SqlSession session = MybatisUtils.getSession();
        //����List���ϣ���װ��ѯid
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        //ִ��SqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByIds", ids);
        //�����ѯ�����Ϣ
        for (Customer customer : customers) {
            //��ӡ������
            System.out.println(customer);
        }
        //�ر�SqlSession
        session.close();
    }

    /**
     * <bind>Ԫ�ص�ʹ�ã����ݿͻ���ģ����ѯ�ͻ���Ϣ
     */
    @Test
    public void findCustomerByNameTest() {
        //��ȡSqlSession
        SqlSession session = MybatisUtils.getSession();
        //����Customer���󣬷�װ��ѯ������
        Customer customer = new Customer();
        customer.setUsername("j");
        //ִ��SqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.wjw.mapper.CustomerMapper.findCustomerByName", customer);
        for (Customer customer2 : customers) {
            //��ӡ������
            System.out.println(customer2);
        }
        //�ر�SqlSession
        session.close();
    }
}
