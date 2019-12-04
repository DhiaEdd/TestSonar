package com.inti.formation;

import com.inti.formation.dao.DaoImpl1;

public class Application {

	public static void main(String[] args) {

		DaoImpl1 dao = new DaoImpl1();
		System.out.println("DAO VALUE");
		System.out.println(dao.getValue());		
	}

}
