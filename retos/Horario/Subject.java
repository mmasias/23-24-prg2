public class Subject {
    
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

    public Subject(Subject subject){
        this(subject.name, subject.id, subject.credits);
    }

    public String show(){
        return name + " [" + credits + "]";
    }

    public String showId(){
        return this.id;
    }
    
    public void changeName(String name){
        this.name = name;
    }

    public void changeId(String id){
        this.id = id;
    }
    
    public void changeCredits(int credits){
        this.credits = credits;
    }
    
    public static void main(String[] args) {
        
        Subject subject;
        
        subject = new Subject("Programacion II", "PRG2", 6);
        System.out.println(subject.show());

        Subject mate1 = new Subject("Matematicas II");
        System.out.println(mate1.show() + " - " + mate1.showId());

        mate1.changeCredits(6);
        mate1.changeId("MAT2");
        System.out.println("\n" + mate1.show() + " - " + mate1.showId());

        
    }
}
