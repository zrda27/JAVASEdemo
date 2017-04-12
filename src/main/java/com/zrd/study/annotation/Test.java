package com.zrd.study.annotation;

@A
public class Test {
	@A
	public static void main(@A String[] args) {
		
	}
}

@interface A{
	String n() default "a";
	
}