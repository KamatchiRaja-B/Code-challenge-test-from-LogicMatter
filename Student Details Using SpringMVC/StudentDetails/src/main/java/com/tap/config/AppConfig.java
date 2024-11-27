package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = {"com.tap.entity", "com.tap.daoimpl"})
public class AppConfig {
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setConfigLocation(new org.springframework.core.io.ClassPathResource("hibernate.cfg.xml"));
		return sessionFactoryBean;
	}
}
