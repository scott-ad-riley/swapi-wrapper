package com.codeclan.sr.starwars;

import java.util.ArrayList;
import java.util.Date;

public class Planet extends SWResult {
	
	protected String name;
	protected int rotation_period;
	protected int orbital_period;
	protected int diameter;
	protected String climate;
	protected String gravity ;
	protected String terrain;
	protected int surface_water;
	protected int population;
	protected ArrayList<Integer> residentIds;
	protected ArrayList<Integer> filmIds;
	protected Date created;
	protected Date edited;
	protected String url;

	public String getName() {
		return this.name;
	}
}
