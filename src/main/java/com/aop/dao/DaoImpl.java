package com.aop.dao;

import org.springframework.stereotype.Service;

/**
 * Created by bxguo on 2019/10/28 22:53
 */
@Service
public class DaoImpl implements Dao {
    public void query(){
        System.out.println("query 111111");
    }
}
