package com.codeclan.sr.starwars;

import java.util.ArrayList;
import java.util.Date;

public class Film extends SWResult {
	
	protected String title;
	protected int episode_id;
	protected String opening_crawl;
	protected String director;
	protected String producer;
	protected Date release_date;
	protected ArrayList<Integer> charactersIds;
	protected ArrayList<Integer> planetIds;
	protected ArrayList<Integer> starshipIds;
	protected ArrayList<Integer> vehicleIds;
	protected ArrayList<Integer> speciesIds;
	protected Date created;
	protected Date edited;
	protected String url;
	
	public String getTitle() {
		return this.title;
	}
	
}