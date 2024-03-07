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

public class Table {

    public int capacity();
    public int number();
    public boolean available();    
    public Table(int capacity, int number, boolean available);

}

public class Interval{

    public Interval createSchedule(int opening, int closing);
    public Interval(Interval openSchedule);

}

public class Main {

    public static void main(String[] args) {
        Interval schedule=new createSchedule(16, 23);
        Restaurant restaurant=new restaurant(schedule);

        Client jaimeLinares=new Client("Jaime Linares");
        Table table1=new Table(1,5);
        boolean tableAvailable=table1.available();
        if(tableAvailable){
            Booking jaimeLinaresReserve=new Booking(jaimeLinares,"06/03/2024","22:00",table1);
        }
    }
} 

