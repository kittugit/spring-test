package com.example.springtest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerFT {
	
	@LocalServerPort
	int port;
	
	@Before
	public void init(){
		RestAssured.port = port;
		RestAssured.baseURI = "http://localhost";
	}
	
	@Test
	public void testHello(){
		
		RestAssured.get("/test").then().statusCode(HttpStatus.OK.value());
		
	}

}
