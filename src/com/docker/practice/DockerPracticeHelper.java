package com.docker.practice;

public class DockerPracticeHelper {

	private int a = 10;
	private int b = 20;
	
	public int add(){
		int c = a + b;
		System.out.println("a + b = " + c);
		return c;
	}

	public int subtract(){
		int c = b - a;
		System.out.println("b - a = " + c);
		return c;
	}

	public int multiply(){
		int c = a * b;
		System.out.println("a * b = " + c);
		return c;
	}

	public int divide(){
		int c = b/a;
		System.out.println("a / b = " + c);
		return c;
	}
}
