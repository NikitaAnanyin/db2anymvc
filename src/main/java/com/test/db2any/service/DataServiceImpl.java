package com.test.db2any.service;

import com.test.db2any.dao.DataDAO;
import com.test.db2any.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    DataDAO dataDAO;

    @Autowired
    public DataServiceImpl(DataDAO dataDAO) {
        this.dataDAO = dataDAO;
    }

    public Data getDataById(Long id) {
        return dataDAO.getDataById(id);
    }
}
