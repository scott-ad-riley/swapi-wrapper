package com.codeclan.sr.starwars;

import org.junit.*;
import static org.junit.Assert.*;

public class CollectionTests {
	// APITest.java
	@Test
	public void testPersonRequestLength() {
		SWRequest request = new PeopleRequest();
		Person luke = (Person) request.send();
		assertTrue(luke.getName().equals("Luke Skywalker"));
	}
}
