package com.codeclan.sr.starwars;

public class PlanetRequest extends SWRequest {
	
	public PlanetRequest(int planetId) {
		super("http://swapi.co/api/planets/" + planetId);
	}

	@Override
	protected SWResult send() {
		rawResult = this.request.getResponse();
		PlanetParser parser = new PlanetParser(rawResult);
		parser.parse();
		return parser.result();
	};
}
