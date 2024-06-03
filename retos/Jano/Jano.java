import java.util.Scanner;

public class Jano {
    private Nodo[] nodos;
    public Jano() {
        nodos = new Nodo[15];
        nodos[0] = new Nodo(0, "Tienes algunos de los siguientes sintomas? 0=No 1=Si \nTos\nRespiración corta o dificultad para respirar\nFatiga\nDolor muscular o del cuerpo\nDolor de cabeza\nPerdida reciente del olfato o del gusto\nDolor de garganta\nCongestión o secreción nasal\nNausea o vomito\nDiarrea?");
        nodos[1] = new Nodo(1, "¿Hay una condición cronica preexistente documentada que explica los sintomas? 0=No 1=Si");
        nodos[2] = new Nodo(2, "¿Fue la persona identificada como contacto cercano los últimos 14 días? 0=No 1=Si");
        nodos[3] = new Nodo(3, "¿Resultado de la prueba COVID tomada después del comienzo de los síntomas? 0=Negativa 1=Positivo/No realizada");
        nodos[4] = new Nodo(4, "¿Que tipo de prueba se administro? 0=Molecular 1=Antígenos");
        nodos[5] = new Nodo(5, "¿Fue la persona identificada con contacto cercano loa últimos 14 días? 0=No 1=Si");
        nodos[6] = new Nodo(6, "¿Salió negativa la prueba molecular de segimietno tomada dentro de 48 horas? 0=No 1=Si");
        nodos[7] = new Nodo(7, "¿Puede la persona proporcionar evidencia de un diagnóstico negativo de una muestra recolectada en el día 5 o más tarde? 0=No 1=Si");
        nodos[8] = new Nodo(8, "¿La persona puede y está dispuesta a usar mascarilla los dias 6-10? 0=No 1=Si");
        nodos[9] = new Nodo(9, "Puede volver a la escuela o trabajo");
        nodos[10] = new Nodo(10, "Quédese an casa hasta que mejoren los síntomas, usualmente después de 24 horas sin fiebre y sin uso de medicamentos para reducir fiebre.");
        nodos[11] = new Nodo(11, "1. Quédese en casa hasta que los síntomas hayan mejorade de acuerdo con la política de cuidado infantil existente, usualmente 24 horas sin fiebre y sin usar medicamentos para reducir fiebre.\n2. Luego use el arbol de decisiona para contacto cercano y cuarentena para determinar cuando se permite regreasr al trabajo o al cuidado infantil");
        nodos[12] = new Nodo(12, "Regresar en o después de 6 días a partir del comienzo de síntomas, si los sintomas han mejorado y han pasado más de 24 horas sin fiebre y sin el uso de medicamentos para reducir fiebre.\nDesde día 6 al 10 debe usar una mascarilla que se ajuste perfectamente sobre boca y nariz mientras se está en interiores y cuando está con otras personas en lugares abiertons. Si esta exento del uso de mascarilla se requiere que vuelva el día 11.");
        nodos[13] = new Nodo(13, "Regresar en o después de 11 días a partir del comienzo de los síntomas has mejorado y han pasado 24 horas sin fiebre o sin el uso de medicamentos para reducir fiebre.");
        nodos[14] = new Nodo(14, "Hasta la vista");

        nodos[0].asignarLaterales(nodos[14], nodos[1]);
        nodos[1].asignarLaterales(nodos[3], nodos[2]);
        nodos[2].asignarLaterales(nodos[9], nodos[3]);
        nodos[3].asignarLaterales(nodos[4], nodos[8]);
        nodos[4].asignarLaterales(nodos[5], nodos[6]);
        nodos[5].asignarLaterales(nodos[10], nodos[11]);
        nodos[6].asignarLaterales(nodos[7], nodos[5]);
        nodos[7].asignarLaterales(nodos[13], nodos[12]);
        nodos[8].asignarLaterales(nodos[13], nodos[7]);
        nodos[9].asignarLaterales(nodos[14], nodos[14]);
        nodos[10].asignarLaterales(nodos[14], nodos[14]);
        nodos[11].asignarLaterales(nodos[14], nodos[14]);
        nodos[12].asignarLaterales(nodos[14], nodos[14]);
        nodos[13].asignarLaterales(nodos[14], nodos[14]);
        nodos[14].asignarLaterales(nodos[14], nodos[14]);
    }

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        boolean finalizado = false;
        int ubicacion = 0;
        int seleccion;
        Nodo nodoSiguiente;
        do {
            nodos[ubicacion].mostrar();
            seleccion = scanner.nextInt();
            if (seleccion == 0){
                nodoSiguiente = nodos[ubicacion].izquierda();
                ubicacion = nodoSiguiente.valor();
            } else {
                nodoSiguiente = nodos[ubicacion].derecha();
                ubicacion = nodoSiguiente.valor();
            }
            finalizado = nodos[ubicacion].izquierda() == nodos[14] && nodos[ubicacion].derecha() == nodos[14];
        } while (!finalizado);
        nodos[ubicacion].mostrar();
    }

    public static void main(String[] args) {
        new Jano().iniciar();
    }
}
