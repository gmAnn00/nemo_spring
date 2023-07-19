package com.mynemo.nemo.test.vo;

import org.springframework.stereotype.Component;

@Component("testVO")
public class TestVO {
	private int test;

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}
	
}
