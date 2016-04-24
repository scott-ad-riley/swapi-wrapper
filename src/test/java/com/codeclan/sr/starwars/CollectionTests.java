package com.codeclan.sr.starwars;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CollectionTests {

	@Test
	public void testPersonRequestFirstName() {
		PeopleRequest request = new PeopleRequest();
		ArrayList<Person> people = request.send();
		assertTrue(people.get(0).getName().equals("Luke Skywalker"));
	}
}
