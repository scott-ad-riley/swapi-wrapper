package com.codeclan.sr.starwars;

//import com.codeclan.md.APIRequest;
//import com.codeclan.sr.sr.SWResult;

public abstract class SWRequest {

	protected String rawResult;
	protected String url;
	protected SWResult result;
	protected Request request;
	
	protected SWRequest(String url) {
		rawResult = "";
		request = new Request(url);
	}
	
	protected abstract SWResult send(); 

}
