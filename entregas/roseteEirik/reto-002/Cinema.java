class Cinema {
    public Cinema (String name, Location address);

    public void open();
    public void closed();
    public boolean isOpen();
    public void showListing();
    public void addMovie(Movie movie);
    public Ticket giveTicket(Movie movie);
}

class Movie {
    public Movie (String title, String studio, int duration);
}

class Ticket {
    public Ticket (Movie movie);
}

class Visitor {
    public Visitor (String name);
}

class Location {
    public Location (String street, int number);
}

Location myAddress = new Location("Isabel Torres", 21);
Cinema myCinema = new Cinema("Cinema++", myAddress);

if (myCinema.isOpen()){
    Movie starWarsFour = new Movie('Star Wars IV', 'LucasFilm', 121);
    myCinema.addMovie(starWarsFour);

    Visitor alejandro = new Visitor("Alejandro"); 
    myCinema.giveTicket(alejandro);
} else {
    myCinema.open();
}

myCinema.closed();