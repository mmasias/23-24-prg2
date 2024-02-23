# Vista pública de las Clases

## Sintaxis

```java
class  <NombreClase> {

}
```

## Cabecera de Métodos de la Clase

```java
public <tipo1> <nombreMetodo> ( {<tipo2> <parametro>, ...}* )

```

- Tipo1 indica el tipo del valor devuelto, que puede ser:_
  - void, nada, dado que el efecto será un cambio de estado en el objeto y/o sistema
  - <primitivo/Clase>, un valor de tipo primitivo o una referencia a un objeto de una clase
  - <primitivo/Clase>[], una referencia a un vector de valores de tipos primitivos o de referencias a objetos
  - <primitivo/Clase>[][], una referencia a una matriz de valores de tipos primitivos o de referencias a objetos
  - etc...
- el nombre del método debe comenzar con minúscula
- el tipo2 puede ser igual que tipo1 excepto void
- todos los parámetros son pasados por valor

## Sobrecarga de Métodos

Varios métodos pueden tener el mismo nombre con las siguientes restricciones:

- Si están en la misma clase, deben diferenciarse en el número o tipo de parámetros comparados dos a dos.
- Si están en distintas clases, no existe restricción.

## Constructores

Son métodos que reúnen las tareas de inicialización (no construyen) y se lanzan automáticamente en la construcción de objetos. 

- Deben coincidir su nombre con el de la clase;
- No devuelven nada (ni void);
- No se pueden lanzar mensajes que se correspondan con los constructores de la clase.

## Destructores

Son métodos que reúnen las tareas de liberación de recursos (no destruyen) y se lanzan automáticamente en la destrucción de objetos. 

- Su cabecera debe ser: public void finalize()
- No se pueden lanzar mensajes que se correspondan con los destructores de la clase.
- muy poco frecuentes porque:
  - Java tiene incorporado un recolector de basura que libera automáticamente la memoria dinámica no apuntada por ninguna referencia
  - normalmente un objeto no “vive” con una línea de comunicación, un fichero abierto, ... que deba cerrar y, en tal caso, es preferible gestionar dichos recursos sin intervención de automatismos
