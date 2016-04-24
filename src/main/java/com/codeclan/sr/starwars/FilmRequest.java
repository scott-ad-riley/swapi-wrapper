package com.codeclan.sr.starwars;

public class FilmRequest extends SWRequest {
	
	public FilmRequest(int filmId) {
		super("http://swapi.co/api/films/" + filmId);
	}

	@Override
	protected SWResult send() {
		rawResult = this.request.getResponse();
		FilmParser parser = new FilmParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
