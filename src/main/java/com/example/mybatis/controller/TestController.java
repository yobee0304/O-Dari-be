package com.example.mybatis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis.model.dto.portfolio;
import com.example.mybatis.service.TestService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TestController {
    
    private final TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<portfolio> test() {
        return testService.getAllDataList();
    }

}
