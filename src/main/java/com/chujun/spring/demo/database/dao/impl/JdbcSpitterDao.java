package com.chujun.spring.demo.database.dao.impl;

import com.chujun.spring.demo.database.dao.IBaseDao;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by chujun on 2015/10/29.
 */
@Component
public class JdbcSpitterDao implements IBaseDao {
    @Resource
    private SimpleJdbcTemplate simpleJdbcTemplate;

    public SimpleJdbcTemplate getSimpleJdbcTemplate() {
        return simpleJdbcTemplate;
    }

    public void setSimpleJdbcTemplate(SimpleJdbcTemplate simpleJdbcTemplate) {
        this.simpleJdbcTemplate = simpleJdbcTemplate;
    }
}
