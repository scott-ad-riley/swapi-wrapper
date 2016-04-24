package com.codeclan.sr.starwars;

public class FilmRequest implements SWRequest {
	
	String rawResult;
	String url;
	Request request;
	SWResult result;
	
	public FilmRequest(int filmId) {
		rawResult = "";
		request = new Request("http://swapi.co/api/films/" + filmId);
	}

	public SWResult send() {
		rawResult = this.request.getResponse();
		FilmParser parser = new FilmParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
