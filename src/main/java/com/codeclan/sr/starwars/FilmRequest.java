package com.codeclan.sr.starwars;

public class FilmRequest extends SWRequest implements SWItemRequest {
	
	public FilmRequest(int filmId) {
		super(filmId, "films");
	}

	public SWResult send() {
		rawResult = this.request.getResponse();
		FilmParser parser = new FilmParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
