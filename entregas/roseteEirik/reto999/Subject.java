package entregas.roseteEirik.reto999;

public class Subject{
    private String name;
    private String id;
    private int credits;
    
    public Subject(String name, String id, int credits){
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    public Subject(String name){
        this(name, name.substring(0,4).toUpperCase(), 0);
    }
    
    public String show(){
        return name + " [" + id + "] (" + credits + ")";
    }

    public String showId(){
        return id;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public void changeId(String newId){
        this.id = newId;
    }

    public void changeCredits(int newCredits){
        this.credits = newCredits; 
    }

    public static void main(String[] args) {
        
        Subject subject;
        subject = new Subject("Discreta", "DISC", 220);

        subject.changeName("Matematica Discreta");
        Subject subject1 = new Subject("Tecnologias de la Informacion y Comunicacion");
        
        System.out.println(subject.show());
        System.out.println(subject1.show());

    }
}