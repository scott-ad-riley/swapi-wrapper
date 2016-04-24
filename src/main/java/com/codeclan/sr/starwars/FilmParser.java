package com.codeclan.sr.starwars;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.lang.model.type.UnknownTypeException;

public class FilmParser implements SWItemParser {

	private Film result;
	
	public FilmParser(String rawResult) {
		JSONParser parser = new JSONParser();
		this.result = new Film();
		try {
			JSONObject obj = (JSONObject) parser.parse(rawResult);
			this.result.title = (String) obj.get("title");
		} catch (ParseException e) {
			System.err.println("Unable to parse JSON {"+rawResult+"}: "+e.getMessage());
		} catch (UnknownTypeException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public Film result() {
		return this.result;
	}

}
