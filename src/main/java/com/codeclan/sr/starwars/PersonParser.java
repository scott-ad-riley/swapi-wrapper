package com.codeclan.sr.starwars;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.lang.model.type.UnknownTypeException;

public class PersonParser implements SWItemParser {

	private Person result;
	
	public PersonParser(String rawResult) {
		JSONParser parser = new JSONParser();
		this.result = new Person();
		try {
			JSONObject parseInput = (JSONObject) parser.parse(rawResult);
			this.result.name = (String) parseInput.get("name");
		} catch (ParseException e) {
			System.err.println("Unable to parse JSON {"+rawResult+"}: "+e.getMessage());
		} catch (UnknownTypeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public PersonParser(JSONObject parseInput) {
		this.result = new Person();
		this.result.name = (String) parseInput.get("name");
	}
	
	static Person parse(JSONObject parsedJSON) {
		// this feels like bad practice/bad idea
		// Static method to create an instance of the class it's in
		PersonParser self = new PersonParser(parsedJSON);
		return (Person) self.result();
	}
	
	@Override
	public Person result() {
		return this.result;
	}

}
