package entregas.grizoniManuela;

public class biblioteca {

    private String name;
    private String address;
    private int maxCapacity;

    public biblioteca(String name, String address, int maxCapacity){
        this.name = name;
        this.address = address;
        this.maxCapacity = maxCapacity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    
    
}

