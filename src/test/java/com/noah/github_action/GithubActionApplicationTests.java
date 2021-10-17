package com.noah.github_action;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GithubActionApplicationTests {


	@Test
	@DisplayName("Hello My Test1")
	void contextLoads() {
		assertEquals(2, 1+1);
	}

	@Test
	@DisplayName("Hello My Test2")
	void failTest() {
		assertEquals(4, 1+3);
	}

}
