package com.codeclan.sr.starwars;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.lang.model.type.UnknownTypeException;

public class FilmParser extends JSON {

	private Film result;
	private JSONParser parser;
	
	public FilmParser(String rawResult) {
		this.parser = new JSONParser();
		this.raw = rawResult;
		this.result = new Film();
	}
	
	public void parse() {
		try {
			JSONObject obj = (JSONObject) parser.parse(this.raw);
			this.result.title = (String) obj.get("title");
		} catch (ParseException e) {
			System.err.println("Unable to parse JSON {"+this.raw+"}: "+e.getMessage());
		} catch (UnknownTypeException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public SWResult result() {
		return this.result;
	}

}
