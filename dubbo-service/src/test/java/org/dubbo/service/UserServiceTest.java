package org.dubbo.service;

import javax.annotation.Resource;

import org.junit.Test;

public class UserServiceTest extends AbstractServiceTest{

	@Resource
	private UserService userService;
	@Test
	public void test1() {
		userService.getUserById(1);
	}
}
