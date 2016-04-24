package com.codeclan.sr.starwars;

import org.junit.*;
import static org.junit.Assert.*;

public class ItemTests {
	// APITest.java
	@Test
	public void testPeopleRequestName() {
		int lukeId = 1;
		SWRequest request = new PersonRequest(lukeId);
		Person luke = (Person) request.send();
		System.out.println(luke.getName());
		assertTrue(luke.getName().equals("Luke Skywalker"));
	}
	
	@Test
	public void testPlanetRequestName() {
		int tatooineId = 1;
		SWRequest request = new PlanetRequest(tatooineId);
		Planet tatooine = (Planet) request.send();
		System.out.println(tatooine.getName());
		assertTrue(tatooine.getName().equals("Tatooine"));
	}
}