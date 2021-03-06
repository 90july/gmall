package com.sunnada.gmall.ums;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableDubbo
@SpringBootApplication
@MapperScan("com.sunnada.gmall.ums.mapper")
public class GmallUmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUmsApplication.class, args);
	}

}
