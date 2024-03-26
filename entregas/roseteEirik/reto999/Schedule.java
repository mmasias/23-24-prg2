package entregas.roseteEirik.reto999;

class Schedule {

    private Subject[][] subjects;

    public Schedule(){
        subjects = new Subject [5][8];
    }
    
    public void addSubject(Subject subject, int day, int hour){
        this.subjects[day][hour] = subject;
    }

    public void exchange(int firstDay, int firstHour, int secondDay, int secondHour){

    }

    public String show(){
        for(int hour=0; hour<=8; hour++){
            for(int day=0; day<=5; day++){
                if (){

                }
            }
        }  
        return null;
    }
}
