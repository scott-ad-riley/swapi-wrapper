#SWAPI Wrapper

* Java wrapper for the star wars API
* Weekend Project/Learning
* Using http://swapi.co
* Setup should ultimately be `import com.codeclan.sr.starwars` to use - no idea how to do this though (probably some maven thing?)

## Basic Usage

Request all the people:
``` java
  SWRequest request = new PeopleRequest();
  ArrayList<Person> people = request.send();
```

Request a person (Luke in this case):
``` java
  int lukeId = 1;
  SWRequest request = new PersonRequest(lukeId);
  Person luke = (Person) request.send();
```

## Complex Usage

Request Film list, filtering using luke
``` java
  SWRequest request = new FilmsRequest(Person luke);
  ArrayList<Film> lukesFilms = request.send();
```

### Items

* ~~Planet~~
* Spaceship
* Vehicle
* ~~Person~~
* ~~Film~~
* Species

### Collections

* Planets
* Spaceships
* Vehicles
* ~~People~~
* Films
* Species


## TODO
* Models/Requests/Parsers for each collection item with correct values 
  * Likely inherit from one parent object?
    * Build first and then see how we can refactor
* Models/Requests/Parsers for each collection
  * See problem below
  * Dealing with paginated API Responses from swapi
* Collection filtering
* Refactoring

## Questions/Problems
* If my .send() method from SWRequest abstract class is specified to return a SWResult, how can i let it return an ArrayList<SWResult> if you get a list of items?
  * What if we have two abstract classes, one SWRequestItem and one SWRequestCollection. The first behaves as normal, but the second's .send() returns ArrayList<SWResult>?
    * SWRequestCollection then extends from ArrayList<SWResult>
    * This might break LSP (Liskov Substitution Principle - read more later)
  * What if we convert SWRequest to an interface?
    * How to handle default behaviour?

* Deal with what to call species (Plural and Singular are the same word)