package com.aop.service;

import com.aop.dao.DaoImpl;

/**
 * Created by bxguo on 2019/10/30 23:16
 */
public class CommonImpl implements CurdService<DaoImpl> {

    public int save(DaoImpl record) {
        return 0;
    }
}
