package com.example.mybatis.model.dao;

import java.util.List;

import com.example.mybatis.model.dto.portfolio;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<portfolio> getAllDataList();
}
