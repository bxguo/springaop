package com.aop.service;

import com.aop.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by bxguo on 2019/11/7 0:06
 */
@Service
public class CityService {
    @Autowired
    private CityDao cityDao;
    public List<Map<String, Object>> query(){
        cityDao.query();
        return cityDao.query();
    }
}
