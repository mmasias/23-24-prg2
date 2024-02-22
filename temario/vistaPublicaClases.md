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
