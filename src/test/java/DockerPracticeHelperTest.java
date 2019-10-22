package com.docker.practice.test;

import org.junit.Test;

import com.docker.practice.DockerPracticeHelper;

public class DockerPracticeHelperTest {

	DockerPracticeHelper helper = new DockerPracticeHelper();
	
	@Test
	public void addTest(){
		
		helper.add();	
	}
	
	@Test
	public void subtractTest(){
		
		helper.subtract();	
	}
	
	@Test
	public void multiplyTest(){
		
		helper.multiply();	
	}
	
	@Test
	public void divideTest(){
		
		helper.divide();	
	}
}
