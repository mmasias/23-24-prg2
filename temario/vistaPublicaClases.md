# Vista pública de las Clases

## Sintaxis

```java
class  <NombreClase> {

}
```

## Cabecera de métodos de la clase

```java
  public <tipo1> <nombreMetodo> ({<tipo2> <parametro>, ...}*)

```

- Tipo1 indica el tipo del valor devuelto, que puede ser:_
  - void, nada, dado que el efecto será un cambio de estado en el objeto y/o sistema
  - <primitivo/Clase>, un valor de tipo primitivo o una referencia a un objeto de una clase
  - <primitivo/Clase>[], una referencia a un vector de valores de tipos primitivos o de referencias a objetos
  - <primitivo/Clase>[][], una referencia a una matriz de valores de tipos primitivos o de referencias a objetos
  - etc...
- el nombre del método debe comenzar con minúscula
- el tipo2 puede ser igual que tipo1 excepto void
- Todos los parámetros son pasados **por valor**

> *En Java, cuando se pasa un parámetro a un método, lo que se pasa realmente es una **copia del valor** de ese parámetro. Esto implica que cualquier cambio en ese valor dentro del método no afectará al valor original fuera del método.<br><br>
Sin embargo, la confusión suele surgir cuando se trata de objetos. En Java, las variables de tipo objeto en realidad contienen **referencias a objetos** en lugar de los objetos mismos. Cuando se pasa una variable de objeto a un método, Java pasa la copia de la referencia al objeto. Aunque técnicamente esto sigue siendo "pasar por valor" (porque la referencia se copia por valor), en la práctica significa que el método llamado puede modificar el objeto al que apunta la referencia. Esto es porque tanto la referencia original como la copia apuntan al mismo objeto en la memoria.<br><br>Es crucial entender que, aunque se pueda modificar el objeto al que apunta la referencia dentro del método (porque la referencia copiada apunta al mismo objeto), no se puede cambiar la referencia original para que apunte a un nuevo objeto. En otras palabras, dentro del método, si se intenta hacer que la referencia copiada apunte a un nuevo objeto, esto no afectará a la referencia original fuera del método.*

## Sobrecarga de métodos

Varios métodos pueden tener el mismo nombre con las siguientes restricciones:

- Si están en la misma clase, deben diferenciarse en el número o tipo de parámetros comparados dos a dos.
- Si están en distintas clases, no existe restricción.

## Constructores

Son métodos que reúnen las tareas de inicialización (no construyen) y se lanzan automáticamente en la construcción de objetos. 

- `public NombreDeLaClase()`
- Deben coincidir su nombre con el de la clase;
- No devuelven nada (ni void);
- No se pueden lanzar mensajes que se correspondan con los constructores de la clase.

## Destructores

Son métodos que reúnen las tareas de liberación de recursos (no destruyen) y se lanzan automáticamente en la destrucción de objetos. 

- Su cabecera debe ser: `public void finalize()`
- No se pueden lanzar mensajes que se correspondan con los destructores de la clase.
- muy poco frecuentes porque:
  - Java tiene incorporado un recolector de basura que libera automáticamente la memoria dinámica no apuntada por ninguna referencia
  - normalmente un objeto no “vive” con una línea de comunicación, un fichero abierto, ... que deba cerrar y, en tal caso, es preferible gestionar dichos recursos sin intervención de automatismos
