# Intro II

## ¿Por qué?

Porque como ingenieros hemos de lidiar con la complejidad inherente a los sistemas que hemos de modelar.

## ¿Qué?

La historia del ser humano disfruta de **cuatro mecanismos mentales** que facilitan enormemente nuestra comprensión de los sistemas (complejos):

|||
|-|-|
|Abstracción|Proceso mental de extracción de las características esenciales de algo, ignorando los detalles superfluos
|Encapsulación|Proceso por el que se ocultan los detalles del soporte de las características esenciales de una abstracción
|Modularización|Proceso de descomposición de un sistema en un conjunto de piezas poco acoplados y cohesivos
|Jerarquización|Proceso de estructuración por el que se produce una organización de un conjunto de elementos en grados o niveles de responsabilidad, de clasificación o de composición, …​ entre otros

## ¿Para qué?

Dominar la complejidad.

## ¿Cómo?

### Clase & Objeto

||Clase|Objeto|
|-|-|-|
||Descripción de los datos y de las operaciones que describen el comportamiento de un cierto conjunto de elementos homogéneos.|Ejemplar concreto (instancia) de una clase, que responde al comportamiento definido por las operaciones de la clase a la que pertenece, adecuándose al estado de sus datos particulares.|
||Intervalo|horasDeClase / miPresionArterial
|Datos|Extremos inferior y superior|(8,10) / (80,120)
|Operaciones|intersección, longitud, desplazar, etc.|

### Mensaje

Invocación de una operación sobre un objeto. Un objeto es el agente activo que lanza el mensaje y otro objeto es el agente pasivo que recibe el mensaje. El objeto receptor del mensaje debe contemplar dicha operación entre las definidas en su clase.

Ej. Mensajes a objetos de la Clase Intervalo

```java
    (8,10).longitud() --> obtengo 2
    (-100,100).desplazar(3) --> cambio el intervalo a (-97,103)
    misHorasDeTrabajo.interseccion(tusHorasDeTrabajo) --> (16,18)
```

### Método

Definición de una operación de una clase.

Ej. Métodos de la Clase Intervalo

- **longitud**: extremo superior menos extremo inferior
- **desplazar**: acumular cantidad a ambos extremos

### Atributo

Cada uno de los datos de una clase, y por tanto, presente en todos los objetos de esa clase.

Ej. Atributos de la clase Intervalo

- extremos inferior y superior

### Estado

Conjunto de los valores de los atributos que tiene un objeto, por pertenecer a una clase, en un instante dado.

Ej. Estados de objetos de la clase Intervalo

- 8 en el extremo inferior y 14 en el extremo superior de presiónArterial;
- 9 en el extremo inferior y 18 en el extremo superior de misHorasDeTrabajo;

### Relación de todos estos elementos



|Clase|Objeto|
|-|-|
|Descripción de los datos y de las operaciones que describen el comportamiento de un cierto conjunto de elementos homogéneos.|Ejemplar concreto (instancia) de una clase, que responde al comportamiento definido por las operaciones de la clase a la que pertenece, adecuándose al estado de sus datos particulares.|
|Una clase es la definición de los atributos y métodos que describen el comportamiento de un cierto conjunto de objetos homogéneos.|Un objeto es un ejemplar concreto de una clase que responde a los mensajes correspondientes a los métodos de ésta, adecuándose al estado de sus atributos.

Las clases asumen el principio de encapsulación: cuando se describe una clase, se debe describir tanto su vista pública o
interfaz como su vista privada o implantación.

La vista pública o interfaz describe qué operaciones responden los objetos de esta clase, o sea, su comportamiento.

La vista privada o implantación describe las estructuras de datos de la clase y cómo manipulan las operaciones los datos. De esta forma, se conjugan la abstracción inherente en la clase con la encapsulación de sus datos y de su forma de operar

Las clases que conjugan de forma equilibrada atributos (datos) y métodos (operaciones) son el único bloque de construcción de programas: módulos.

Esta modularidad exige que:

- Los datos y operaciones de una clase son elementos estrechamente relacionados favoreciendo que “una clase se entiende por sí misma” –cohesión-.
- las clases se relacionan -acoplamiento- al colaborar en jerarquías de composición, clasificación, ... para constituir los programas

**Herencia:** transmisión de atributos y métodos de una clase a otra clase.

Ej. A partir de la Clase Intervalo

- IntervaloCerradoCerrado [x,x]
- IntervaloAbiertoCerrado (x,x]

**Polimorfismo:** enlace dinámico de expresiones a clases y/o de mensajes a métodos.

Ej. Objetos intercambiables de las clases Intervalo, IntervaloCerradoCerrado, ...

### Programación estructurada vs POO

|PROGRAMACIÓN ESTRUCTURADA|BASES DE LA PROGRAMACIÓN|POO|
|-|:-:|-|
|Registro + Funciones|Abstracción, Encapsulación y Modularidad|Clase|
|Variable de Tipo Registro|Abstracción, Encapsulación|Objeto|
|Función|Modularidad|Método|
Llamada a Función|Abstracción|Mensaje
Campo de un Registro|Encapsulación y Modularidad|Atributo
Estado de una Variable Registro|Encapsulación|Estado
Registros de Campos Variables|Abstracción y Modularidad|Herencia
Punteros a Funciones|Abstracción y Encapsulación|Polimorfismo
