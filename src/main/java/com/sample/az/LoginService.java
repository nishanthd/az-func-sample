package com.sample.az;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public String login(String userName) {
		return "Hello " + userName.toUpperCase() + ", you are successfully logged in!!!";
	}

}
