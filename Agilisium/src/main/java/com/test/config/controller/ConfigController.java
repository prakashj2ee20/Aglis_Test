package com.test.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.config.response.ConfigResponse;
import com.test.config.service.ConfigService;

@RestController
public class ConfigController {
    @Autowired
	public  ConfigService cfgService;

	@GetMapping(value = "{domain}/api/getconfigdetails", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    
	public ResponseEntity<ConfigResponse> getconfigdetails(@PathVariable String domain){
		
		ConfigResponse resp=cfgService.getConfigService(domain);
		return new ResponseEntity<>(resp, HttpStatus.OK);
		
		
	}
}
