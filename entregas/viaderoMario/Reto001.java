public class Reto001 {

  public static void main(String[] args) {
    int[] box = { 0, 0, 0, 0, 0 };
    int[] items = { 0, 0, 0, 0, 0 };
    boolean[] free = { true, true, true, true, true };
    int queque = 0;
    final int minutesPerDay = 12 * 60;
    int nClients = 0;
    boolean newPerson = false;
    int timeWithoutQueque = 0;
    int totalItems = 0;

    for (int time = 1; time < minutesPerDay; time++) {
      boolean activa = true;
      if (Math.random() * 100 < 40) {
        newPerson = true;
        queque++; 
        if (free[0]) {
          box[0]++;
          free[0] = false; 
          items[0] = ((int) (Math.random() * 100)) % 11 + 5;
          totalItems = totalItems + items[0];
          queque--;
        } else if (free[1]) {
          box[1]++;
          free[1] = false;
          items[1] = ((int) (Math.random() * 100)) % 11 + 5;
          totalItems = totalItems + items[1];
          queque--;
        } else if (free[2]) {
          box[2]++;
          free[2] = false; 
          items[2] = ((int) (Math.random() * 100)) % 11 + 5;
          totalItems = totalItems + items[2];
          queque--;
        } else if (free[3]) {
          box[3]++;
          free[3] = false;
          items[3] = ((int) (Math.random() * 100)) % 11 + 5;
          totalItems = totalItems + items[3];
          queque--;
        } else if (free[4] && activa) {
          box[4]++;
          free[4] = false; 
          items[4] = ((int) (Math.random() * 100)) % 11 + 5;
          totalItems = totalItems + items[4];
          queque--;
        }
      }

      if (items[0] > 0) {
        items[0]--;
        if (items[0] == 0) {
          free[0] = true;
        }
      }
      if (items[1] > 0) {
        items[1]--;
        if (items[1] == 0) {
          free[1] = true;
        }
      }
      if (items[2] > 0) {
        items[2]--;
        if (items[2] == 0) {
          free[2] = true;
        }
      }
      if (items[3] > 0) {
        items[3]--;
        if (items[3] == 0) {
          free[3] = true;
        }
      }
      if (items[4] > 0) {
        items[4]--;
        if (items[4] == 0) {
          free[4] = true;
        }
      }
      if (queque == 0) {
        timeWithoutQueque++;
      }
      System.out.println(
        "--------------------------------------------------------------"
      );
      System.out.print("MINUTO " + time);
      if (newPerson) {
        System.out.println(" - LLega 1 persona - En cola: " + queque);
        newPerson = false;
      } else {
        System.out.println(" - LLega 0 persona - En cola: " + queque);
      }
      System.out.print(
        " Caja1:[" +
        items[0] +
        "] | Caja2:[" +
        items[1] +
        "] | Caja3:[" +
        items[2] +
        "] | Caja4:[" +
        items[3] +
        "]"
      );
      if (items[4] > 0 || activa) {
        System.out.println(" Caja5:[" + items[4] + "] ");
      } else {
        System.out.println();
      }

      if (queque >= 15) {
        activa = true;
      } else {
        activa = false;
      }
    }

    for (int i = 0; i < box.length; i++) {
      System.out.println(
        "clintes totales que pasan por la caja " + i + ": " + box[i]
      );
    }

    for (int i = 0; i < box.length; i++) {
      int totalPeople = 0;
      totalPeople = totalPeople + box[i];
      System.out.println(
        "Personas que han pasado por la tienda " + totalPeople
      );
    }

    System.out.println("Hoy se han vendido " + totalItems + " de productos");
    System.out.println(
      "La cola ha estado vacia durante " + timeWithoutQueque + " minutos"
    );
  }
}
