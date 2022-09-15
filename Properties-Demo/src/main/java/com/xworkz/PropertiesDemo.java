package com.xworkz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PropertiesDemo {

	public String url;
	public String username;
	public String password;

	public PropertiesDemo(@Value("${url}") String url,
			@Value("${un}") String username,@Value("${pwd}") String password) {
	
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "PropertiesDemo [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
