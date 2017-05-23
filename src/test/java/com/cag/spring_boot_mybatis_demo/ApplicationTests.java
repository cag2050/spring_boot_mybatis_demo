package com.cag.spring_boot_mybatis_demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cag.spring_boot_mybatis_demo.domain.User;
import com.cag.spring_boot_mybatis_demo.domain.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class ApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		System.out.println("test");
		userMapper.insert("AAA", 20);
		User u = userMapper.findByName("AAA");
		System.out.println("User u=");
		System.out.println(u.getName());
		System.out.println(u.getAge());
		System.out.println(u.getId());
		Assert.assertEquals(20, u.getAge().intValue());
	}
}
