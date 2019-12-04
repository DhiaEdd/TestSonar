package com.inti.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inti.formation.DaoImpl1;

public class DaoImplTest {

	DaoImpl1 dao = new DaoImpl1();
	
	@Test
	public void getValueReturnFive() {
		
		assertEquals(5, dao.getValue());
		
	}
	
	
	
}
