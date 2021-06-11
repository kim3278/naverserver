package com.test.naverserverproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import spring_mybatis.EmpController;
import spring_mybatis.EmpDAO;

@SpringBootApplication
@ComponentScan 
@ComponentScan(basePackageClasses =EmpController.class )
@MapperScan(basePackageClasses = EmpDAO.class)
public class NaverserverprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaverserverprojectApplication.class, args);
	}

}
