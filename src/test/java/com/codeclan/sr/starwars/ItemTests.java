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
		assertTrue(luke.getName().equals("Luke Skywalker"));
	}
	
	@Test
	public void testPlanetRequestName() {
		int tatooineId = 1;
		SWRequest request = new PlanetRequest(tatooineId);
		Planet tatooine = (Planet) request.send();
		assertTrue(tatooine.getName().equals("Tatooine"));
	}
	
	@Test
	public void testFilmRequestTitle() {
		int aNewHopeId = 1;
		SWRequest request = new FilmRequest(aNewHopeId);
		Film aNewHope = (Film) request.send();
		assertTrue(aNewHope.getTitle().equals("A New Hope"));
	}
}