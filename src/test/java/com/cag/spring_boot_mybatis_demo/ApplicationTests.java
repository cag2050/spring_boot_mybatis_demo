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
// 表示所有类下所有方法都使用事物
@Transactional
public class ApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	// 数据会回滚
	@Rollback
	public void findByName() throws Exception {
		userMapper.insert("AAA", 20);
		User u = userMapper.findByName("AAA");
		Assert.assertEquals(20, u.getAge().intValue());
	}
}
