# Miembros de Clase

|Instancia|Clase|
|-|-|
|Los miembros de instancia asumen los aspectos, datos y operaciones, particulares/locales de/a cada objeto de la clase|Los miembros de clase o estáticos asumen los aspectos, datos y operaciones, compartidos/globales por/a la comunidad de objetos de la clase|
|**Atributos de instancia** presentes en cada uno de los objetos de la clase|**Atributos de clase** compartidos por la globalidad de objetos de la clase|
|*Ej.: día, mes y año de una fecha concreta.*|*Ej.: los nombres y duración de los meses de cualquier fecha, excepto en Febrero de años bisiestos...*|
|Si no hay objetos, no hay atributos de instancia|Si no hay objetos, **sí** hay atributos de clase|
|**Métodos de instancia** cuyos mensajes se lanzan sobre un objeto particular de la clase|**Métodos de clase** cuyos mensajes NO se lanzan sobre un objetos particular|
|*Ej.: si una fecha concreta está dentro de la primavera, si una fecha concreta se encuentra en un año bisiesto​*|*Ej.: si un año (de cualquier fecha, no de una fecha particular) es bisiesto*|

## Atributos y métodos estaticos

Caracterizados por la palabra reservada `static` tras su visibilidad

<div align=center>

|||
|-|-|
|**Atributo**|`<Visibilidad> static <Tipo> <atributoEstático> = <Valor>`|
|**Método**|`<Visibilidad> static <TipoDevuelto> <métodoEstático>([<argumento> { <argumento>, }])`|

</div>

### Atributos estáticos

- Su reserva de memoria e inicialización obligatoria se realiza al principio de la ejecución del programa,
- En orden dentro de las declaraciones de la clase pero en desorden entre las distintas clases
- Accesibles desde cualquier método, de instancia o estático, de la clase.

Notación sintáctica para el acceso desde las expresiones:

`<Clase>.<atributoEstático>`

### Métodos estáticos

- Se permite el acceso a los atributos estáticos
- No se permite el acceso a `this` ni a los atributos de instancia

Notación sintáctica para la invocación/llamada/ejecución del método estático como sentencia de los métodos:

`<Clase>.<metodoEstatico>([<argumento> { <argumento>, }])`

## Ejemplo

```java
public class Alumno {
    private static String nombreUniversidad = "UNEATLANTICO";
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    public static void cambiarUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public static String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void mostrarUniversidad() {
        System.out.println(nombre + " estudia en: " + nombreUniversidad);
    }

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Juan", 15);
        Alumno alumno2 = new Alumno("María", 16);

        alumno1.presentarse();
        alumno2.presentarse();

        Alumno.cambiarUniversidad("UNINI");

        System.out.println(Alumno.getNombreUniversidad());

        alumno1.mostrarUniversidad();
        alumno2.mostrarUniversidad();
    }
}

```

## Bloques inicializadores

Bloques de código que se ejecutan cuando se crea una instancia (***bloque inicializador de instancia***) o cuando se carga la clase (***bloque inicializador estático***).

```java
public class Persona {
    private String nombre;
    private int edad;

    {
        nombre = "Sin nombre";
        edad = 0;
    }

    static {
        System.out.println("Clase Persona cargada");
    }
}
```

||Constructores|Bloques inicializadores|
|-|-|-|
|**Nombre**|Tienen el mismo nombre que la clase en la que se encuentran.|No tienen nombre propio.|
|**Tipo de retorno**|No tienen un tipo de retorno (ni siquiera void).|Tampoco tienen tipo de retorno.|
|**Llamada**|Se invocan explícitamente cuando se crea un objeto utilizando new.|Se ejecutan automáticamente cuando se crea un objeto (bloque inicializador de instancia) o cuando se carga la clase (bloque inicializador estático).|
|||*Bloques de instancia*: Se ejecutan siempre antes de cualquier constructor en la creación de objetos.
|||*Bloques estáticos*: Se ejecutan solo una vez, cuando se carga la clase por primera vez.
|**Sobrecarga**|Pueden sobrecargarse para ofrecer diferentes formas de inicializar un objeto con distintos parámetros.|No permiten sobrecarga.
|**Función principal**|Inicializan las propiedades de una instancia y permiten recibir parámetros para ajustar los valores.|Se utilizan para inicializar propiedades comunes a todos los constructores, para reducir duplicación de código o para realizar tareas iniciales específicas que no dependen de los parámetros de entrada.

```java
public class Persona {
    private String nombre;
    private int edad;

    {
        nombre = "Sin nombre";
        edad = 0;
    }

    static {
        System.out.println("Clase Persona cargada");
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```
