package com.codeclan.sr.starwars;

public class PersonRequest extends SWRequest implements SWItemRequest {
	
	SWResult result;
	
	public PersonRequest(int personId) {
		super(personId, "people");
	}

	public SWResult send() {
		rawResult = this.request.getResponse();
		PersonParser parser = new PersonParser(rawResult);
		return parser.result();
	};
}
