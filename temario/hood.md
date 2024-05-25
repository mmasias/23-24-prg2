# HOOD

|Budd, 94|Ingalls, 81|Booch, 96|
|-|-|-|
|*Cuando los programadores piensan en los problemas, en términos de comportamientos y responsabilidades de los objetos, traen con ellos un caudal de intuición, ideas y conocimientos provenientes de su experiencia diaria*|*En lugar de un saqueador de bits que saquea estructuras de datos, nosotros tenemos un universo de objetos con buen comportamiento que cortésmente se solicitan entre sí cumplir diversos deseos*|*Un objeto en si mismo no es interesante. Los objetos contribuyen al comportamiento de un sistema colaborando con otros objetos*|

Cada objeto de un programa debe asumir directamente cierta parte de sus responsabilidades y saber delegar otras en otros objetos colaboradores: no se trata de que un objeto asuma y “controle todo” y el resto se dispongan a darle la información y aceptarla cuando el “controlador” la haya procesado; se trata de que cada objeto almacene su propia información y, por ende, que cada objeto la procese.

Un programa orientado a objetos parte de una clase principal que contiene todos los objetos que le hacen falta. Y estos, a su vez, contendrán los objetos que le hacen falta para ir completando su tarea.

Una aplicación es un único objeto. Para ejecutarla se envía un único mensaje a la clase principal.

<div align=center>

||Aplicacion|Gestor|Simulador|Juego|
|-|-|-|-|-|
|**Clase prinpal**|App|Manager|Simulator|Game|
|**Método disparador**|execute()|manage()|simulate()|play()|



<table border=1>
<tr><td>

```java
class App {

    public void execute() {

    }

    public static void main (string arg[]) {
        App app = new App();
        app.execute();
    }
}
```

</td>
<td>

```java
class Game {

    public void play() {

    }

    public static void main (string arg[]) {
        Game game = new Game();
        game.play();
    }
}
```

</tr>
</table>

</div>

Una vez que se conoce de dónde partir (la clase del objeto “principal”) y hasta dónde llegar (hasta que nuevas clases no reduzcan los costes), resta saber qué camino seguir para el desarrollo del programa.

El método propuesto es una simplificación extrema y variación de HOOD (diseño orientado a objetos jerárquico). El resultado es un método muy sencillo y utilizable en pequeñas aplicaciones. Este método contiene 5 fases que se aplican cíclicamente para cada clase del programa:

1. Tomar una clase
1. Definir el comportamiento
1. Definir los atributos
1. Codificar los métodos
1. Recapitular nuevas clases y métodos.

Usaremos este método para desarrollar el juego del [Tic tac toe](https://github.com/mmasias/tictactoe/blob/main/README.md)
