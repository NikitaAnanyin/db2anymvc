package com.test.db2any.dao;

import com.test.db2any.mapper.DataMapper;
import com.test.db2any.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Repository
public class DataDAOImpl implements DataDAO {
    InitialContext initialContext = new InitialContext();
    String sqlFindData = (String) initialContext.lookup("java:comp/env/sqlFindQuery");
    JdbcTemplate jdbcTemplate;

    @Autowired
    public DataDAOImpl(JdbcTemplate jdbcTemplate) throws NamingException {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Data getDataById(Long id) {
        return jdbcTemplate.
                queryForObject(sqlFindData, new Object[]{id}, new DataMapper());
    }
}
