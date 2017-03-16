package com.docker.demo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class DBarraytest {

	@Test
	public void test() {
		
			ArrayList  test=DemoDB.dbUpdate();
	        assertNotNull(test);
	}

}