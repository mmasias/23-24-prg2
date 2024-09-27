package ReyOrtizPablo;
public class Examen {
    private String profesorExaminador;
    private String tipoDeExamen;
    private String documentoIdentiad;
    public Examen(String tipoDeExamen,String profesorExaminador,String documentoIdentidad ){
        this.tipoDeExamen=tipoDeExamen;
        this.profesorExaminador=profesorExaminador;
        this.documentoIdentiad=documentoIdentidad;
    }
    public void mostrarInformacionExamen(){
        System.out.println("      Examen: " + tipoDeExamen + " / Vigilado por profesorª.: " + profesorExaminador + " - DNI: " + documentoIdentiad);
    }
}
