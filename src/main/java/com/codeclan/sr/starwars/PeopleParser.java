package com.codeclan.sr.starwars;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;

import javax.lang.model.type.UnknownTypeException;

public class PeopleParser implements SWCollectionParser {

	private ArrayList<Person> result;
	
	public PeopleParser(String rawResult) {
		JSONParser parser = new JSONParser();
		this.result = new ArrayList<Person>();
		Person p;
		
		try {
			JSONObject parseInput = (JSONObject) parser.parse(rawResult);
			JSONArray people = (JSONArray) parseInput.get("results");
			if (parseInput.get("next") != null) {
				Bundler bundler = new Bundler((String) parseInput.get("next"), people);
				bundler.collect();
				people = bundler.response;
			}
	        Iterator<Object> personIterator = people.iterator();
	        while(personIterator.hasNext()) {
	        	Object iteration = personIterator.next(); 
	        	JSONObject personObj;
	        	if (iteration instanceof String) {
	        		personObj = (JSONObject) parser.parse((String) iteration);
	        	} else {
	        		personObj = (JSONObject) iteration;
	        	}
	        	p = PersonParser.parse(personObj);
	            result.add(p);
	        }
		} catch (ParseException e) {
			System.err.println("Unable to parse JSON {"+rawResult+"}: "+e.getMessage());
		} catch (UnknownTypeException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public ArrayList<Person> result() {
		return this.result;
	}

}
