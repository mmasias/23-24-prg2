package entregas.lopezMartin;

public class Schedule {
    
    private Subject[][] subjects;

    public Schedule(){
        subjects = new Subject[5][8];
    }

    public void addSubject(Subject subject, int day, int hour) {
        subjects[day-1][hour-1] = subject;
    }

    public String show() {
        String schedule = "";
        for (int hour = 0; hour < 8; hour++) {
            for (int day = 0; day < 5; day++) {
                String subjectCode = " ---- ";
                if (subjects[day][hour] != null)
                    subjectCode = " " + subjects[day][hour].showCode() + " ";
                schedule += subjectCode;
            }
            schedule += "\n";
        }
        return schedule;
    }    

    public void switchSubject(int firstDay, int firstHour, int secondDay, int secondHour){
        Subject asignaturaTemporal = subjects[firstDay-1][firstHour-1];
        subjects[firstDay-1][firstHour-1] = subjects[secondDay-1][secondHour-1];
        subjects[secondDay-1][secondHour-1] = asignaturaTemporal; 
    }

    public static void main(String[] args) {
        
        Schedule schedule = new Schedule();
    
        Subject tic = new Subject("Tecnologías de la información y comunicación", "tic ",6);
        Subject mates2 = new Subject("Matemática 2", "mat2", 6);
        Subject progra2 = new Subject("Programación II", "prg2",6);
        Subject logica = new Subject("Lógica", "log ",6);
        Subject mateDiscreta = new Subject("Matemática Discreta", "matd",6);

        schedule.addSubject(tic, 1, 1);
        schedule.addSubject(tic, 1, 2);
        schedule.addSubject(tic, 4, 5);
        schedule.addSubject(tic, 4, 6);
        schedule.addSubject(mates2, 1, 3);
        schedule.addSubject(mates2, 1, 4);
        schedule.addSubject(mates2, 4, 1);
        schedule.addSubject(mates2, 4, 2);
        schedule.addSubject(progra2, 2, 5);
        schedule.addSubject(progra2, 2, 6);
        schedule.addSubject(progra2, 5, 3);
        schedule.addSubject(progra2, 5, 4);
        schedule.addSubject(logica, 4, 3);
        schedule.addSubject(logica, 4, 4);
        schedule.addSubject(logica, 5, 5);
        schedule.addSubject(logica, 5, 6);
        schedule.addSubject(mateDiscreta, 2, 1);
        schedule.addSubject(mateDiscreta, 2, 2);
        schedule.addSubject(mateDiscreta, 3, 1);
        schedule.addSubject(mateDiscreta, 3, 2);

        schedule.switchSubject(1,2,1,3);
    
        System.out.println(schedule.show());

    }    
}