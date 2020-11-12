package com.springmvc.test;

import com.springmvc.dao.IUserDao;
import com.springmvc.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    //编写一个测试用例
    private SqlSession session=null;
    private IUserDao dao=null;

    @Before //测试方法之前要执行的方法
    public void init(){
        InputStream ins= null;
        try {
            //获取Mybatis的数据库的链接的配置文件
            ins = Resources.getResourceAsStream("SqlMapConfig.xml");
            //视同Mybatis的链接工厂SqlSessionFactory
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(ins);
            //获取数据库的链接 SqlSession
            session = factory.openSession();
            dao=session.getMapper(IUserDao.class);//
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void destory(){
        if(session!=null){
            session.commit();
            session.close();
        }
    }


    @Test
    public void selectUserAll() throws Exception{
        if(session!=null){
            List<User> emos=dao.findAll();
            for(User temp:emos){
                System.out.println(temp);
            }
        }
    }

    @Test
    public void insertUser() throws Exception{
        if(session!=null){
            User user =new User(12,"娜娜","女",18);
            dao.insertUser(user);
        }
    }



}
