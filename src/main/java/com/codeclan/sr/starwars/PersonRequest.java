package com.codeclan.sr.starwars;

public class PersonRequest extends SWRequest {
	
	public PersonRequest(int personId) {
		super("http://swapi.co/api/people/" + personId);
	}

	@Override
	protected SWResult send() {
		rawResult = this.request.getResponse();
		PersonParser parser = new PersonParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
