# Herencia

**Transmisión**: La herencia en todos los ámbitos (derecho, biología, …​) tiene connotaciones de transmisión

En Programación Orientada a Objetos es la transmisión de todos los miembros (atributos y métodos públicos y privados) de una clase a otra.

## Terminología:

<div align=center>

|Clase base|Clase derivada|
|-|-|
|La que transmite|La que recibe la transmisión
|padre|hija|
|Superclase|Subclase|

</div>

## Implicaciones en la colaboración

|Composición, asociación y dependencia|Herencia|
|-|-|
|Relaciones binarias que devienen de la colaboración entre objetos: envío de mensajes entre objetos.|Es una relación binaria entre clases, pero **no es necesario** que exista una colaboración entre los objetos de sus clases ***aunque*** tampoco lo impide|

Por tanto, los objetos de las clases de una relación de herencia son, a priori, independientes.

## Tipos

|Simple|Múltiple|
|-|-|
Cuando una clase derivada hereda de una única clase base.|Cuando una clase derivada hereda de varias clases base.

## Jerarquías de clasificación

### Definición

Una jerarquía por grado de clasificación es aquélla donde cada nodo (clases) de la jerarquía establece un dominio de elementos (conjuntos de objetos de la clase) incluido en el dominio de los nodos padre e incluye a los dominios de cada nodo hijo

> La relación de herencia permite establecer jerarquías por grado de clasificación

### Características

- Eminentemente subjetivas
  - Ej. paciente de un hospital: publica/privada, por especialidad,…​
- Contemplan elementos que son dificilmente categorizables
  - Ej. Ornitorrinco, pingüino, mula,…​
- Dificultad para establecer una clasificación "perfecta"
- Esqueleto fundamental de un programa junto con la jerarquía de composición

### Reglas de construcción

|Generalización/Especialización|¿Es un...? (Is a...?)|
|-|-|
Cuando existen unas características específicas de un subconjunto de elementos de un determinado conjunto más amplio, que pese a que mantienen las características esenciales e identificativas del conjunto al que pertenecen, también son lo suficientemente relevantes como para ser rasgos distintivos de dicho subconjunto de elementos.|Poder responder afirmativamente que un objeto de la clase hija es un objeto de la clase padre.

<div align=center>

![](/images/modelosUML/plantUML/jerarquiaAnimales.svg)

</div>

## Herencia por extensión

Mediante la palabra reservada `extends`

```java

class <claseDerivada> extends <claseBase> {
   ...
}

class Abuela {
  ...
}
class Padre extends Abuela {
  ...
}
class Hija extends Padre {
  ...
}

```

### Especialización por adición

|||
|-|-|
|**Atributos**|Los atributos añadidos en la clase hija tienen las mismas reglas sintácticas y semánticas que en una clase que no sea derivada
|**Métodos**|Los métodos añadidos en la clase hija tienen las mismas reglas sintácticas y semánticas que en una clase que no sea derivada
||Excepto que **no tienen acceso a los atributos y métodos privados transmitidos desde la clase padre**, si no es a través de los métodos públicos transmitidos desde la clase padre
||Esto permite la contención del mantenimiento, dado que, si se modifica la implantación de la clase padre, no repercute sobre la implantación de la clase hija y se obtiene un mínimo acoplamiento entre ambas clases.
|**Constructores**|Mediante **super**, donde debe ser la primera sentencia de los constructores de la clase derivada y sus argumentos deben coincidir en número y tipo con la lista de parámetros de algún constructor público o protegido de la clase padre
||Se puede omitir para el caso del constructor de la clase padre con una lista vacía de parámetros

#### Implicaciones

|Los objetos de la clase padre|Los objetos de la clase hija|
|-|-|
|No sufren ninguna alteración por la presencia de clases derivadas.|Tienen todos los atributos transmitidos desde la clase padre junto con los atributos añadidos en la clase hija.
||Responden a mensajes que corresponden con los métodos públicos transmitidos desde la clase padre junto con los métodos públicos añadidos en la clase derivada.

### Miembros protegidos

Cuando la clase padre no transmite los métodos públicos necesarios para manipular los atributos privados transmitidos desde la clase padre en los métodos añadidos en la clase hija:

|||
|-|-|
|**¿Haciéndolos publicos?**|No es solución, puesto que rompe el principio de encapsulación ya que, para la implantación de una clase hija, los objetos de la clase padre dan a conocer más allá de lo que se les solicitaba previamente a la existencia de la clase derivada.
|**Haciéndolos protegidos**|Visibilidad protegida (protected), donde los miembros (atributos y/o métodos) son accesibles en la implantación de la clase y en cualquier clase derivada.
||**Atributos protegidos**: Dentro del cuerpo de los métodos de la clase derivada se tiene acceso a los atributos protegidos heredados, a los atributos añadidos, a los parámetros del método y a las declaraciones locales, ley flexible de Demeter.<br>***Pero***: desbordamiento del mantenimiento dado que si se modifica la implantación de la clase padre SI repercute sobre la implantación de la clase hija y se obtiene un máximo acoplamiento entre ambas clases
||**Métodos get/set protegidos** son métodos para obtener el valor y asignar un valor a los atributos privados transmitidos desde la clase padre, posibilitando cualquier manipulación por parte de la clase hija futura. <br> ***Implicación:*** contención del mantenimiento dado que si se modifica la implantación de la clase padre no repercute sobre la implantación de la clase hija y se obtiene un mínimo acoplamiento entre ambas clases

### Especialización por redefinición

Donde la cabecera del método es exactamente igual a la cabecera del método no privado de la clase padre, excepto su visibilidad, que puede ampliarse. En caso contrario, sería sobrecarga y no redefinición

Sus implicaciones son:

- Se anula la transmisión del método de la clase padre.
- Los objetos de la clase padre responden al mensaje con el comportamiento dado en la clase padre.
- Los objetos de la clase hija responden al mensaje con el comportamiento dado en la clase hija.

#### super

|||
|-|-|
En la implantación de cualquier clase derivada, es una referencia constante que guarda la dirección del objeto que recibe el mensaje correspondiente al método que se está redefiniendo, pero con el comportamiento de la clase padre.|Su utilidad será para la reutilización del método de la clase padre, anulado en la transmición, desde la redefinición del método de la clase hija.

