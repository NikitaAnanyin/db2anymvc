package com.test.db2any.mapper;

import com.test.db2any.model.Data;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataMapper implements RowMapper<Data> {

    public Data mapRow(ResultSet resultSet, int i) throws SQLException {

        Data data = new Data();
        data.setId(resultSet.getLong("id"));
        data.setValue(resultSet.getString("value"));
        return data;
    }
}
