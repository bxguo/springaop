package com.aop.dao;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by bxguo on 2019/11/6 23:11
 */

public interface CityDao {
    @Select("select * from city")
    List<Map<String, Object>> query();
}
