package com.example.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mybatis.model.dao.TestMapper;
import com.example.mybatis.model.dto.portfolio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }
}
