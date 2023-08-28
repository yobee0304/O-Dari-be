package com.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.mybatis.model.dao"}) // 찾지 못하는 패키지루트 직접 명시
public class ContinuousReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContinuousReportApplication.class, args);
	}
}