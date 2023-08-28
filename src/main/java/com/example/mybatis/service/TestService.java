package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.model.dao.TestMapper;
import com.example.mybatis.model.dto.portfolio;

@Service
public class TestService{
    
    @Autowired
    private TestMapper testMapper;

    public List<portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }
}
