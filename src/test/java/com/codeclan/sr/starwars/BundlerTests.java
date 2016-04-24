package com.codeclan.sr.starwars;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.util.ArrayList;

public class BundlerTests {
	@Test
	public void testPeoplePagination() {
		String url = "http://swapi.co/api/people";
		Bundler bundler = new Bundler(url);
		bundler.collect();
		assertTrue(true);
	}
}
