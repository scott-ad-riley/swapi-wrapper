package com.codeclan.sr.starwars;

public class PersonRequest implements SWRequest {
	
	String rawResult;
	String url;
	Request request;
	SWResult result;
	
	public PersonRequest(int personId) {
		rawResult = "";
		request = new Request("http://swapi.co/api/people/" + personId);
	}

	public SWResult send() {
		rawResult = this.request.getResponse();
		PersonParser parser = new PersonParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
