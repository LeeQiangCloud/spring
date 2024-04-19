package com.lee.impl;

import com.lee.Fu;
import org.springframework.stereotype.Component;

@Component("Zi")
public class Zi implements Fu {
	@Override
	public void eat() {
		System.out.println("aaaaa");
	}
}
