package net.filippov.newsportal.domain;

import net.filippov.newsportal.domain.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;
	
	@Before
	public void init() {
		user = new User();
	}
	
	@Test
	public void testCreatedNotNull() {
		Assert.assertNotNull(user.getCreated());
	}
}
