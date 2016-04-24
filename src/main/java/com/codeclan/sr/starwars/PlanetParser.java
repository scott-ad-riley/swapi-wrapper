package com.codeclan.sr.starwars;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.lang.model.type.UnknownTypeException;

public class PlanetParser implements SWItemParser {

	private Planet result;
	
	public PlanetParser(String rawResult) {
		JSONParser parser = new JSONParser();
		this.result = new Planet();
		
		try {
			JSONObject obj = (JSONObject) parser.parse(rawResult);
			this.result.name = (String) obj.get("name");
		} catch (ParseException e) {
			System.err.println("Unable to parse JSON {"+rawResult+"}: "+e.getMessage());
		} catch (UnknownTypeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public Planet result() {
		return this.result;
	}

}
