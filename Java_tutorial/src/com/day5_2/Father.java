package com.day5_2;

public class Father extends GrandFather {
	public Father() {
		System.out.println("father constructor");
	}

	public void fatherMethod() {
		System.out.println("father method");
	}

	@Override
	public void method() {
		System.out.println("father modified gf method");
	}
}
