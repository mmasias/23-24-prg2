```java
package documentos.preSRC;

class Cinema {

    public Cinema() {}

    public void showMovies() {}
    public Ticket buyTicket(Moviegoer moviegoer, Movie movie) {
        return
    }
}

class Movie {

    public Movie(String title, String director, int length) {}

    public String getTitle() {
        return}
    public String getDirector() {
        return
    }
    public int getLength() {
        return
    }
}

class Ticket {

    public Ticket(Moviegoer moviegoer, Movie movie) {}

    public Movie getMovie() {
        return
    }
    public Moviegoer getgetMoviegoer() {
        return
    }
}

class Moviegoer {

    public Moviegoer(String name) {}
    public String getName() {
        return
    }
}

class Simulation {
    public static void main(String[] args) {

        Cinema cinesaSantander = new Cinema();

        Movie interstellar = new Movie("Interstellar", "Christopher Nolan", 169);
        Movie lordOfTheRings = new Movie("El Señor de los Anillos", "Peter Jackson", 178);

        cinesaSantander.showMovies();

        Moviegoer rogerWilco = new Moviegoer("Juan");
        Moviegoer guybrushThreepwood = new Moviegoer("Pedro")


        Ticket ticket1 = cinesaSantander.buyTicket(rogerWilco, interstellar);
        Ticket ticket2 = cinesaSantander.buyTicket(guybrushThreepwood, lordOfTheRings);

    }
}
```
