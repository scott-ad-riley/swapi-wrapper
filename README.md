#SWAPI Wrapper

* Java wrapper for the star wars API
* Weekend Project/Learning
* Using http://swapi.co
* Setup should ultimately be `import com.codeclan.sr.starwars``` to use - no idea how to do this though (probably some maven thing?)

## Basic Usage
``` java
  SWRequest request = new PeopleRequest();
  ArrayList<Person> people = request.send();
```

``` java
  int lukeId = 1;
  SWRequest request = new PersonRequest(lukeId);
  Person luke = (Person) request.send();
```

## Complex Usage
``` java
  SWRequest request = new FilmRequest(Person luke);
  ArrayList<Film> lukesFilms = request.send();
```

## Implemented Collections
* Planets
* Spaceships
* Vehicles
* People
* Films
* Species


## TODO
* Implement models for each collection item with correct values (Planet, Spaceship, Vehicle, ~~Person~~, Film, Species)
  * Likely inherit from one parent object?
    * Build first and then see how we can refactor
* Implement models for each collection
  * See problem below

## Questions/Problems
* If my .send() method from SWRequest abstract class is specified to return a SWResult, how can i let it return an ArrayList<SWResult> if you get a list of items?
  * What if we have two abstract classes, one SWRequestItem and one SWRequestCollection. The first behaves as normal, but the second's .send() returns ArrayList<SWResult>?
  * SWRequestCollection then extends from ArrayList<SWResult>
  * This might break LSP (Liskov Substitution Principle - read more later)
* Deal with collections spanning multiple pages