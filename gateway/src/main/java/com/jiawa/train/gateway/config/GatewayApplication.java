package com.jiawa.train.gateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;


@SpringBootApplication
@ComponentScan("com.jiawa")
public class GatewayApplication {

	private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GatewayApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();
		LOG.info("启动成功");
		LOG.info("网关地址:\t http://127.0.0.1:{}",env.getProperty("server.port"));

	}

}
