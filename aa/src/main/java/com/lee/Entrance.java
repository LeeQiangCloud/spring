package com.lee;

import com.lee.impl.Zi;

public class Entrance {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.lee");
//		Fu fu = annotationConfigApplicationContext.getBean("Fu", Fu.class);
//		fu.eat();
//		Zi zi = annotationConfigApplicationContext.getBean("Zi", Zi.class);
//		zi.eat();

		Zi  z []= {
				new Zi(),new Zi()
		};
		int [] a = new int[]{1,2};
		System.out.println(z);
		System.out.println(z.length);
	}
}
