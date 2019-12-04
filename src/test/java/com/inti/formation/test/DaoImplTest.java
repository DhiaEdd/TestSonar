package com.inti.formation.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inti.formation.dao.DaoImpl1;

public class DaoImplTest {

	DaoImpl1 dao = new DaoImpl1();
	
	@Test
	public void getValueReturnFive() {
		
		assertEquals(5, dao.getValue());
		
	}
	
	
	
}
