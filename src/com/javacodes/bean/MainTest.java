package com.javacodes.bean;

public class MainTest {

	public static void main(String[] args) {

		StudentJDBCDAO student = new StudentJDBCDAO();
		Bean alok = new Bean();
		alok.setName("Sandeep");
		alok.setRollNo(1);
		alok.setCourse("M.tech");
		alok.setAddress("Vijayawada");
		Bean tinkoo = new Bean();
		tinkoo.setName("Naresh");
		tinkoo.setRollNo(6);
		// Adding Data
		student.add(alok);
		// Deleting Data
		student.delete(7);
		// Updating Data
		student.update(tinkoo);
		// Displaying Data
		student.findAll();
	}
	}


