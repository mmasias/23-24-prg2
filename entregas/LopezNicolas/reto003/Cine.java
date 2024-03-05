package entregas.LopezNicolas.reto003;

 class Cinema {

    public Cinema(String name, Location location);

    public void open();
    public void open(Date date);
    public void open(Intervalo time);
    public void closed();
    public boolean nowOpen();
    public String[] billboard(Movie movie);
    public int rooms();

 }

 class Movie {

    public Movie (String title, String director, long duration);
    
 }
