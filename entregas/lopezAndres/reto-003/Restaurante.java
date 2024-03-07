public class Restaurant {

    public boolean isOpen(Interval openSchedule);
    public Restaurant(Interval openSchedule);

}

public class Cliente {

    public String name();
    public String surname();
    public Client(String name, String surname);

}

public class Booking {

    public Booking(Client client, String date, Stering time, Table table);
    public String date();
    public String time();
    public boolean inSchedule(Interval schedule);

}
