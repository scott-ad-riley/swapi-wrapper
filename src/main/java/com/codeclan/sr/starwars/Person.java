package com.codeclan.sr.starwars;

import java.util.ArrayList;
import java.util.Date;

public class Person extends SWResult {
	protected String name;
	protected float height;
	protected float mass;
	protected String hairColor;
	protected String skinColor;
	protected String eyeColor;
	protected String birthYear;
	protected String gender;
	protected String homeworld;
	protected ArrayList<Integer> filmIds;
	protected ArrayList<Integer> speciesIds;
	protected ArrayList<Integer> vehiclesIds;
	protected ArrayList<Integer> starshipsIds;
	protected Date created;
	protected Date edited;
	protected String url;
	
	public String getName() {
		return name;
	}
}
