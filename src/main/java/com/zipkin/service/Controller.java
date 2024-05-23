package com.zipkin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	private static final Logger LOG = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private RestTemplate restTemplate;
	   
	@GetMapping("/demoPath1")
	public ResponseEntity<String> demoPath1() {
		
	  LOG.info("Request at {} for request /demoPath1 ");
	  ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:8001/home	 ", String.class);
	  return ResponseEntity.ok("response from /demoPath1 ===> " + res.getBody());
	}
	
	@GetMapping("/demoPath2")
	public ResponseEntity<String> demoPath2() {
		
	  LOG.info("Request at {} for request /demoPath2 ");
	  ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:8001/home", String.class);
	  return ResponseEntity.ok("response from /demoPath2 ===> " + res.getBody());
	}

}
