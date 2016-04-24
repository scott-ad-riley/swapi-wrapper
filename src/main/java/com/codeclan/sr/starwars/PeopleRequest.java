package com.codeclan.sr.starwars;

import java.util.ArrayList;

public class PeopleRequest extends SWRequest implements SWCollectionRequest {
	
	public PeopleRequest() {
		super("people");
	}

	@Override
	public ArrayList<Person> send() {
		rawResult = this.request.getResponse();
		PeopleParser parser = new PeopleParser(rawResult);
		return parser.result();
	}
}
