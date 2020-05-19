package com.test.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.config.response.ConfigResponse;

@Service
public class ConfigService {
	@Autowired
	public Environment env;

	public ConfigResponse getConfigService(String domain) {

		ConfigResponse cnfResp = new ConfigResponse();
		cnfResp.setDomain(domain);
		cnfResp.setAppname(env.getProperty("spring.application.name"));
		cnfResp.setJdbcurl(env.getProperty("spring.datasource.url"));
		cnfResp.setJdbcusername(env.getProperty("spring.datasource.username"));
		cnfResp.setPassword(env.getProperty("spring.datasource.password"));
		cnfResp.setPort(Long.parseLong(env.getProperty("spring.application.name")));
		cnfResp.setShowsql(env.getProperty("spring.jpa.show-sql"));
		cnfResp.setDdlauto(env.getProperty("spring.jpa.hibernate.ddl-auto"));
		cnfResp.setDialect(env.getProperty("org.hibernate.dialect.MySQL5Dialect"));

		return cnfResp;

	}

}
