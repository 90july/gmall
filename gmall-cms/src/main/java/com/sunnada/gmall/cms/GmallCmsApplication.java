package com.sunnada.gmall.cms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDubbo
@EnableTransactionManagement
@MapperScan("com.sunnada.gmall.cms.mapper")
@SpringBootApplication
public class GmallCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallCmsApplication.class, args);
	}

}
