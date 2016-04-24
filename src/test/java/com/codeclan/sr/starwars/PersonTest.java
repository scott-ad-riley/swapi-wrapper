package com.codeclan.sr.starwars;

import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	// APITest.java
	@Test
	public void testPeopleRequest() {
		int lukeId = 1;
		SWRequest request = new PersonRequest(lukeId);
		Person person = (Person) request.send();
		System.out.println(person.getName());
		assertTrue(person.getName().equals("Luke Skywalker"));
	}
}