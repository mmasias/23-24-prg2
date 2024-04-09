package entregas.lopezMartin;

public class Subject {

    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        assert name!=null && code.length()==4 && credits >=0;

        this.name = name;
        this.code = code.toUpperCase();
        this.credits = credits;
    }

    public Subject(String name){
        this(name,name.substring(0, 4),0);
    }

    public void setCredits(int credits){
        assert credits>=0;
        
        this.credits = credits;
    }

    public String show() {
        return name + " [" + credits + "]";
    }

    public String showCode() {
        return code;
    }

}
