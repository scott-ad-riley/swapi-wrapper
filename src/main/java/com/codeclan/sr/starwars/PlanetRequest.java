package com.codeclan.sr.starwars;

public class PlanetRequest implements SWRequest {
	
	String rawResult;
	String url;
	Request request;
	SWResult result;	
	
	public PlanetRequest(int planetId) {
		rawResult = "";
		request = new Request("http://swapi.co/api/planets/" + planetId);
	}

	public SWResult send() {
		rawResult = this.request.getResponse();
		PlanetParser parser = new PlanetParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
