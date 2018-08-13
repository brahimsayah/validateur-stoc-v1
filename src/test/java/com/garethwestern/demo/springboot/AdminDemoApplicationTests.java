package com.garethwestern.demo.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.axione.validateur.stoc.AdminDemoApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AdminDemoApplication.class)
@WebAppConfiguration
public class AdminDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
