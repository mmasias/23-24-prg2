public class Booking {

    public String date();

    public String time();

    public Booking(Client client, String date, String time, Table table);

    public boolean inSchedule(Interval schedule);

}

public class Client {

    public String name();

    public String phoneNumber();

    public Client(String name, String phoneNumber);

}

public class Interval{

    public Interval createSchedule(int opening, int closing);

    public Interval(Interval openSchedule);

}

public class Table {

    public boolean isAvailable();

    public int seatsNumber();

    public int tableNumber();

    public Table(int tableNumber, int seatsNumber);
}

public class Restaurant {

    public boolean isRestaurantOpen(Interval openSchedule);

    public Restaurant(Interval openSchedule);

}
    Interval schedule = new createSchedule(16, 23);

    Restaurant restaurant = new Restaurant(schedule);

    Client angelRomero = new Client("Angel Romero", "+34634921680");
    Table table1 = new Table(1, 5);
    boolean isTableAvailable = table1.isAvailable();

    if(isTableAvailable){
    Booking angelRomeroBooking = new Booking(angelRomero, "05/03/24", "18:30", table1);

    }