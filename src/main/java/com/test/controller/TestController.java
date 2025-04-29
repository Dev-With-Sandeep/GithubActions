package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> testApi() {
		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}
}
