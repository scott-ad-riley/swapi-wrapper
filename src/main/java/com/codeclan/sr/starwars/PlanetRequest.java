package com.codeclan.sr.starwars;

public class PlanetRequest extends SWRequest implements SWItemRequest {

	SWResult result;	
	
	public PlanetRequest(int planetId) {
		super(planetId, "planets");
	}

	public SWResult send() {
		rawResult = this.request.getResponse();
		PlanetParser parser = new PlanetParser(rawResult);
		return parser.result();
	};
}
