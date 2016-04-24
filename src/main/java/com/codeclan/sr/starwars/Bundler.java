package com.codeclan.sr.starwars;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;

import javax.lang.model.type.UnknownTypeException;

public class Bundler {
	
	JSONArray response;
	String currentUrl;
	
	public Bundler(String initialUrl) {
		this.currentUrl = initialUrl;
		this.response = new JSONArray();
	}
	
	public String collect() {
		String pageString = requestPage();
		JSONParser parser = new JSONParser();
		String nextUrl = null;
		JSONArray result = null;
		try {
			JSONObject obj = (JSONObject) parser.parse(pageString);
			nextUrl = (String) obj.get("next");
			result = (JSONArray) obj.get("results");
		} catch (ParseException e) {
			System.err.println("Unable to parse JSON {"+pageString+"}: "+e.getMessage());
		} catch (UnknownTypeException e) {
			System.err.println(e.getMessage());
		}
		addToResponse(result);
		if (nextUrl != null) {
			currentUrl = nextUrl;
			collect();
		}
		return response.toString();
	}
	
	public String requestPage() {
		Request request = new Request(currentUrl);
		return request.getResponse();
	}
	
	public void addToResponse(JSONArray result) {
		String p;
        Iterator<JSONObject> resultIterator = result.iterator();
        while(resultIterator.hasNext()) {
        	String item = resultIterator.next().toString();
            this.response.add(item);
        }
	}
	
}
