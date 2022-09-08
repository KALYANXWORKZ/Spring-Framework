package com.xworkz.fan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Power {
	@Value("201")
	private int id;

	@Override
	public String toString() {
		return "Power [id=" + id + "]";
	}

}
