package com.codeclan.sr.starwars;

public abstract class SWRequest {
	
	String rawResult;
	String url;
	Request request;
	
	private SWRequest() {
		rawResult = "";
	}
	
	public SWRequest(int itemId, String collectionName) {
		this();
		this.url = "http://swapi.co/api/" + collectionName + "/" + itemId;
		this.request = new Request(this.url);
	}
	
	public SWRequest(String collectionName) {
		this();
		this.url = "http://swapi.co/api/" + collectionName;
		this.request = new Request(this.url);
	}
}
