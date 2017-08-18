package com.example.springtest.controller;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {
	
	@Test
	public void test(){
		HelloController controller = new HelloController();
		assertThat(controller.test()).isEqualTo("hello");
	}

}
